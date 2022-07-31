package by.epam.task02.repository.impl;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidSpecification;

public class PyramidAreaSpecification implements PyramidSpecification {
    private double minArea;
    private double maxArea;

    public PyramidAreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    @Override
    public boolean specify(Pyramid pyramid) {
        PyramidCalculationImpl calculation = new PyramidCalculationImpl();
        double area = calculation.pyramidArea(pyramid);
        boolean isSpecified = (area >= minArea && area<= maxArea);
        return isSpecified;
    }
}
