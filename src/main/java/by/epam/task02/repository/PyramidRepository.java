package by.epam.task02.repository;

import by.epam.task02.entity.Pyramid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PyramidRepository {
    private static final PyramidRepository instance = new PyramidRepository();
    private final List<Pyramid> pyramidList = new ArrayList<>();

    public PyramidRepository() {
    }

    public static PyramidRepository getInstance() {
        return instance;
    }

    public int size() {
        return pyramidList.size();
    }

    public boolean isEmpty() {
        return pyramidList.isEmpty();
    }

    public boolean contains(Pyramid p) {
        return pyramidList.contains(p);
    }

    public boolean add(Pyramid pyramid) {
        return pyramidList.add(pyramid);
    }

    public boolean remove(Pyramid p) {
        return pyramidList.remove(p);
    }

    public Pyramid get(int index) {
        return pyramidList.get(index);
    }

    public Pyramid set(int index, Pyramid element) {
        return pyramidList.set(index, element);
    }

    public  List<Pyramid> sortStream(Comparator<? super   Pyramid> comparator){
        return pyramidList.stream().sorted(comparator).collect(Collectors.toList());
    }

    public List<Pyramid> sort(Comparator<? super Pyramid> comparator) {
        List<Pyramid> pyramidListCopy = new ArrayList<>(pyramidList);
        pyramidListCopy.sort(comparator);
        return pyramidListCopy;
    }
//     public List<Pyramid> query(PyramidSpecification specification){
//        return pyramidList.stream().filter(specification:: specify)).collect(Collectors.toList());
//
//     }



}
