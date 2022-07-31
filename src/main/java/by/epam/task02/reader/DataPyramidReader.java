package by.epam.task02.reader;

import by.epam.task02.exception.PyramidException;

import java.util.List;

public interface DataPyramidReader {
    List<String> pyramidList (String path)  throws PyramidException;

}
