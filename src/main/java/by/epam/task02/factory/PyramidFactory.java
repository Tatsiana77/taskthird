package by.epam.task02.factory;

import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PyramidFactory {
    private static final Logger logger = LogManager.getLogger();
    private static final int VALUE_COUNT = 10;

    public PyramidFactory() {
    }

    public static Pyramid createPyramid(List<Double> coordinates) throws PyramidException {
        if (coordinates.size() != VALUE_COUNT) {
            logger.log(Level.ERROR, "Invalid argument  count :  {} ", coordinates);
            throw new PyramidException("Invalid argument count :  " + coordinates);
        }
        Point vertex = new Point(coordinates.get(0), coordinates.get(1));
        Point base1 = new Point(coordinates.get(2), coordinates.get(3));
        Point base2 = new Point(coordinates.get(4), coordinates.get(5));
        Point base3 = new Point(coordinates.get(6), coordinates.get(7));
        Point base4 = new Point(coordinates.get(8), coordinates.get(9));
        var pyramid = new Pyramid(vertex, base1, base2, base3, base4);
        return pyramid;
    }
}

