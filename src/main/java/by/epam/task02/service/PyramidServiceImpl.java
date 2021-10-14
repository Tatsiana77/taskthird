package by.epam.task02.service;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;

public class PyramidServiceImpl implements PyramidService{
    @Override
    public boolean isPyramid(Pyramid pyramid) throws PyramidException {
        return false;
    }

    @Override
    public double calcArea(Pyramid pyramid) throws PyramidException {
        return 0;
    }

    @Override
    public double calcPerimeterBase(Pyramid pyramid) throws PyramidException {
        return 0;
    }

    @Override
    public double calcHeight(Pyramid pyramid) throws PyramidException {
        return 0;
    }
}
