package by.epam.task02.comparator;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Pyramid;

import java.util.Comparator;

public class PyramidVolumeComparator implements Comparator<Pyramid>{

    @Override
    public int compare(Pyramid o1, Pyramid o2) {
        PyramidCalculationImpl calculation  = new PyramidCalculationImpl();
        double firstPyramidVolume  = calculation.pyramidVolume(o1);
        double secondPyramidVolume = calculation.pyramidVolume(o2);
        return Double.compare(firstPyramidVolume, secondPyramidVolume);
    }
}
