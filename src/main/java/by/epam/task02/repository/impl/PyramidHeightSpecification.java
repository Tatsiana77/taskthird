package by.epam.task02.repository.impl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidSpecification;

public class PyramidHeightSpecification implements PyramidSpecification {
    private double minHeight;
    private double maxHeight;

    public PyramidHeightSpecification(double minHeight, double maxHeight) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean specify(Pyramid pyramid) {
        boolean  isSpecified = (pyramid.getHeight() >= minHeight && pyramid.getHeight()<=maxHeight);
        return isSpecified;
    }
}
