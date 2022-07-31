package by.epam.task02.repository.impl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidSpecification;

public class PyramidSquareSpecification implements PyramidSpecification {

    @Override
    public boolean specify(Pyramid pyramid) {
        boolean isSpecified = (pyramid.getVertex().getY()>0
                && pyramid.getVertex().getY() >0
                && pyramid.getVertex().getZ() >0);
        return isSpecified;
    }
}
