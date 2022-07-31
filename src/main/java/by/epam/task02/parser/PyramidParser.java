package by.epam.task02.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PyramidParser {
    public static final Logger logger = LogManager.getLogger();

    private static final String REGEX_SPLIT_PYRAMID= "\\p{Punct}*\\s+";

    public List<double[]> parseString(List<String> shapeStringList) {
        List<double[]> shapeDoubleList = new ArrayList<>();
        for (String s : shapeStringList) {
            String[]  arr = s.split(REGEX_SPLIT_PYRAMID);
            double[] arrayOfDoubles = Stream.of(arr).mapToDouble(Double::parseDouble).toArray();
            shapeDoubleList.add(arrayOfDoubles);
        }
        logger.info("Parsing data: " + shapeDoubleList);
        return shapeDoubleList;
    }
}
