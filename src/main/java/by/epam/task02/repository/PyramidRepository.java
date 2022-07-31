package by.epam.task02.repository;

import by.epam.task02.entity.Pyramid;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface PyramidRepository {
    void addPyramid(Pyramid pyramid);

    void addAllPyramids(Collection<Pyramid> pyramids);

    void removePyramid(Pyramid pyramid);

    boolean removeAllPyramid(Collection<Pyramid> pyramids);

    List<? super Pyramid> query(PyramidSpecification specification);

    List sort(Comparator<? super Pyramid> comparator);
}
