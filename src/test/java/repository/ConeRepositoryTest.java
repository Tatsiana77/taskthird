package repository;

import by.epam.task02.comparator.PyramidHeightComparator;
import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.impl.ConeRepositoryImpl;
import by.epam.task02.repository.impl.PyramidIdSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ConeRepositoryTest {

    Point point = new Point(1, 2, 3);
    Pyramid pyramid = new Pyramid(point, 2, 5);
    Pyramid pyramid1 = new Pyramid(point, 3, 8);
    ConeRepositoryImpl coneRepository = new ConeRepositoryImpl();
    Collection<Pyramid> pyramidList = new ArrayList<>();

    @Test
    void size() {
        coneRepository.addPyramid(pyramid);
        assertEquals(coneRepository.size(), 1);
    }

    @Test
    void getById() {
        coneRepository.addPyramid(pyramid);
        assertEquals(coneRepository.get(0), pyramid);
    }

    @Test
    void addPyramid() {
        coneRepository.addPyramid(pyramid);
        int expectedSizeAfterRemove = 1;
        assertEquals(expectedSizeAfterRemove, coneRepository.size());
    }


    @Test
    void addAllPyramid(){
        pyramidList.add(pyramid);
        pyramidList.add(pyramid1);
        coneRepository.addAllPyramids(pyramidList);
        assertTrue(pyramidList.contains(coneRepository.get(0)));
    }

    @Test
    void  removePyramid(){
        addAllPyramid();
        coneRepository.removePyramid(pyramid);
        int expectedSizeAfterRemove =1;
        assertEquals(expectedSizeAfterRemove, coneRepository.size());
    }

    @Test
    void removeAllPyramid(){
        addAllPyramid();
        assertTrue(coneRepository.removeAllPyramid(pyramidList));
    }

    @Test
    void query(){
        addPyramid();
        PyramidIdSpecification specification = new PyramidIdSpecification(1);
        assertEquals(coneRepository.query(specification), coneRepository.get(0));
    }

    @Test
    void sort(){
        addAllPyramid();
        PyramidHeightComparator comparator = new PyramidHeightComparator();
        coneRepository.sort(comparator);
        assertEquals(coneRepository.get(0), pyramid);
    }
}
