package by.epam.task02.reader.impl;

import by.epam.task02.exception.PyramidException;
import by.epam.task02.reader.DataPyramidReader;
import by.epam.task02.validator.PyramidLineValidator;
import by.epam.task02.validator.PyramidValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataPyramidReaderImpl implements DataPyramidReader {

    static final Logger logger = LogManager.getLogger();

    @Override
    public List<String> pyramidList(String path) throws PyramidException {
        if (!PyramidValidator.isValidFile(path)) {
            logger.log(Level.ERROR, "File path represents invalid file");
            throw new PyramidException("File path represents invalid file");
        }
        Path dataPath = Paths.get(path);
        List<String> correctLines;
        try (Stream<String> fileLines = Files.lines(dataPath)) {
            correctLines = fileLines
                    .filter(PyramidLineValidator::isValidLine)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, "Error while reading file {}", path);
            throw new PyramidException("Error while reading file " + path);
        }
        logger.log(Level.INFO, "Correct lines were read in file: {}", path);
        return correctLines;
    }
}
