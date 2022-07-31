package by.epam.task02.action;

import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;

public interface PyramidCalculation {
    double pyramidArea(Pyramid pyramid);

    double pyramidVolume(Pyramid pyramid);

    double pyramidVolumeRatio(Pyramid pyramid, Point point) throws PyramidException;

    boolean isPyramid(double sideLength, double height);

    boolean isBaseOnPlane(Pyramid pyramid);
}
