package by.epam.task02.repository;

import by.epam.task02.entity.Pyramid;
@FunctionalInterface
public interface PyramidSpecification {
    public boolean specify(Pyramid pyramid);
}
