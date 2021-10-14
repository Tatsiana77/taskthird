package by.epam.task02.repository.impl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidSpecification;

public class PyramidIdSpecification implements PyramidSpecification {

    private  final long id;

    public PyramidIdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(Pyramid pyramid) {
        return  pyramid.getPyramidId()==id;
    }
}
