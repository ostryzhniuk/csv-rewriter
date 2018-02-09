package com.sombrainc.utils;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.BeanWriterProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.csv.CsvWriter;
import com.univocity.parsers.csv.CsvWriterSettings;
import org.apache.commons.io.output.ByteArrayOutputStream;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CSVHandler {

    public static <E> void writeBeans(List<E> beans, Path path, Class<E> beanType){

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Writer outputWriter = new OutputStreamWriter(byteArrayOutputStream);

        CsvWriterSettings settings = new CsvWriterSettings();
        settings.setRowWriterProcessor(new BeanWriterProcessor<>(beanType));

        CsvWriter writer = new CsvWriter(outputWriter, settings);
        writer.writeHeaders();
        writer.processRecords(beans);
        writer.close();

        try(OutputStream outputStream = new FileOutputStream(path.toString())) {

            Files.createFile(path.getFileName());
            byteArrayOutputStream.writeTo(outputStream);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

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

}
