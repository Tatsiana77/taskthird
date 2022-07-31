package by.epam.task02.repository.impl;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidSpecification;

public class PyramidVolumeSpecification implements PyramidSpecification {
    private final double minVolume;
    private final double maxVolume;

    public PyramidVolumeSpecification(double minVolume, double maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    @Override
    public boolean specify(Pyramid pyramid) {
        PyramidCalculationImpl calculation = new PyramidCalculationImpl();
        double volume  = calculation.pyramidVolume(pyramid);
        return (minVolume <= volume && volume <=maxVolume);
    }
}
