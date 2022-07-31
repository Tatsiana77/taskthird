package by.epam.task02.repository.impl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidRepository;
import by.epam.task02.repository.PyramidSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class ConeRepositoryImpl implements PyramidRepository {
    private static final Logger logger = LogManager.getLogger();
    private static ConeRepositoryImpl instance;
    private List<Pyramid> pyramidList;

    public ConeRepositoryImpl() {
        pyramidList = new ArrayList<>();
    }

    public static ConeRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new ConeRepositoryImpl();
        }
        return instance;
    }

    public int size() {
        return pyramidList.size();
    }

    public List<Pyramid> getPyramidList() {
        return Collections.unmodifiableList(pyramidList);
    }

    public Pyramid get(int index) {
        return pyramidList.get(index);
    }

    @Override
    public void addPyramid(Pyramid pyramid) {
        pyramidList.add(pyramid);
    }

    @Override
    public void addAllPyramids(Collection<Pyramid> pyramids) {
        pyramidList.addAll(pyramids);
    }

    @Override
    public void removePyramid(Pyramid pyramid) {
        pyramidList.remove(pyramid);
    }

    @Override
    public boolean removeAllPyramid(Collection<Pyramid> pyramids) {
        return pyramidList.removeAll(pyramids);
    }

    @Override
    public List<? super Pyramid> query(PyramidSpecification specification) {
        List<Pyramid> resultList = pyramidList.stream().
                filter(specification :: specify).
                collect(Collectors.toList());
        return resultList;
    }

    @Override
    public List sort(Comparator<? super Pyramid> comparator) {
        List<Pyramid> resultList = pyramidList.stream().
                sorted(comparator).collect(Collectors.toList());
        return resultList;
    }
}
