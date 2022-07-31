package by.epam.task02.factory;

import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import by.epam.task02.validator.PyramidLineValidator;
import by.epam.task02.validator.PyramidParameterValidator;
import by.epam.task02.validator.PyramidValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PyramidFactory {

    public static Pyramid createPyramid(Point vertex, double height, double sideLength) {
        return new Pyramid(vertex, height, sideLength);
    }

    public static Pyramid createPyramid(double x, double y, double z, double sideLength, double height) {
        return createPyramid(new Point(x, y, z), sideLength, height);
    }

    public static Pyramid createPyramid(double[] parameters) {
        Point points = new Point(parameters[0], parameters[1], parameters[2]);
        double sideLength = parameters[3];
        double height = parameters[4];
        return createPyramid(points, sideLength, height);
    }

}


