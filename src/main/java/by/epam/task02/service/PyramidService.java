package by.epam.task02.service;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;

public interface PyramidService {
    boolean isPyramid(Pyramid pyramid) throws PyramidException;

    double calcArea(Pyramid pyramid) throws PyramidException;

    double calcPerimeterBase(Pyramid pyramid) throws PyramidException;

    double calcHeight(Pyramid pyramid ) throws  PyramidException;

}
