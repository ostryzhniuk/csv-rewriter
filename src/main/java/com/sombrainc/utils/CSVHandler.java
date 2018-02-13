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
    private final static String DELIMITER = ";";
    private final static String LINE_SEPARATOR  = "\r\n";
    private final static String ENCODING  = "UTF-8";

    public static <E> void writeBeans(List<E> beans, File file, Class<E> beanType){
        overwriteFile(Paths.get(file.getPath()));

        CsvFormat format = new CsvFormat();
        format.setDelimiter(DELIMITER.charAt(0));
        format.setLineSeparator(LINE_SEPARATOR);

        CsvWriterSettings settings = new CsvWriterSettings();
        settings.setRowWriterProcessor(new BeanWriterProcessor<>(beanType));
        settings.setFormat(format);

        CsvWriter writer = new CsvWriter(file, ENCODING, settings);
        writer.writeHeaders();
        writer.processRecords(beans);
        writer.close();

    }

    public static <E> List<E> parseBeans(File csvFile, Class<E> beanType) {
        BeanListProcessor<E> beanListProcessor = new BeanListProcessor<>(beanType);

        CsvParserSettings parserSettings = new CsvParserSettings();
        parserSettings.setProcessor(beanListProcessor);
        parserSettings.setDelimiterDetectionEnabled(true);
        parserSettings.setNumberOfRowsToSkip(2);

        CsvParser parser = new CsvParser(parserSettings);

        parser.parse(csvFile);

        return beanListProcessor.getBeans();
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

}
