package by.epam.task02.repository.impl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidSpecification;

public class PyramidMaxHeightSpecification  implements PyramidSpecification {

  private  final  double maxHeight;

    public PyramidMaxHeightSpecification(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean specify(Pyramid pyramid) {
        return false;
    }
}
