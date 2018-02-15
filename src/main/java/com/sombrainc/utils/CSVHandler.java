package com.sombrainc.utils;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.BeanWriterProcessor;
import com.univocity.parsers.csv.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public final class CSVHandler {

    private CSVHandler() {
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(CSVHandler.class);
    private final static String ENCODING  = "ISO-8859-3";

    public static <E> void writeBeans(List<E> beans,
                                      File file,
                                      Class<E> beanType,
                                      CsvWriterSettings csvWriterSettings){

        overwriteFile(Paths.get(file.getPath()));

        csvWriterSettings.setRowWriterProcessor(new BeanWriterProcessor<>(beanType));

        CsvWriter writer = new CsvWriter(file, ENCODING, csvWriterSettings);
        writer.writeHeaders();
        writer.processRecords(beans);
        writer.close();
    }

    public static <E> List<E> readBeans(File csvFile,
                                        Class<E> beanType,
                                        CsvParserSettings csvParserSettings,
                                        String encoding) {

        BeanListProcessor<E> beanListProcessor = new BeanListProcessor<>(beanType);
        csvParserSettings.setProcessor(beanListProcessor);
        CsvParser parser = new CsvParser(csvParserSettings);

        if (encoding != null) {
            parser.parse(csvFile, encoding);
        } else {
            parser.parse(csvFile);
        }

        return beanListProcessor.getBeans();
    }

    public static <E> List<E> readSapBeans(File csvFile, Class<E> beanType) {
        return readBeans(csvFile, beanType, makeParserSettingsForSap(), null);
    }

    public static <E> void writeWeclappBeans(List<E> beans, File file, Class<E> beanType) {
        writeBeans(beans, file, beanType, makeWriterSettingsForWeclapp());
    }

    public static <E> List<E> readWeclappBeans(File csvFile, Class<E> beanType) {
        return readBeans(csvFile, beanType, makeParserSettingsForWeclapp(), ENCODING);
    }

    private static void overwriteFile(Path path){
        try {
            if (Files.exists(path)) {
                Files.delete(path);
            }
            Files.createFile(path);
        } catch (IOException e) {
            LOGGER.error("Overwriting file error", e);
        }
    }

    public static CsvWriterSettings makeWriterSettingsForWeclapp() {
        CsvFormat format = new CsvFormat();
        format.setDelimiter(";".charAt(0));
        format.setLineSeparator("\r\n");

        CsvWriterSettings settings = new CsvWriterSettings();
        settings.setFormat(format);

        return settings;
    }

    public static CsvParserSettings makeParserSettingsForSap() {
        CsvParserSettings settings = new CsvParserSettings();
        settings.setDelimiterDetectionEnabled(true);
        settings.setNumberOfRowsToSkip(2);

        return settings;
    }

    public static CsvParserSettings makeParserSettingsForWeclapp() {
        CsvFormat format = new CsvFormat();
        format.setDelimiter(";".charAt(0));
        format.setQuoteEscape("\"".charAt(0));
        format.setLineSeparator("\r\n");

        CsvParserSettings settings = new CsvParserSettings();
        settings.setFormat(format);

        return settings;
    }

}
