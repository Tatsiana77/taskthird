package factory;

import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.factory.PyramidFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PyramidFactoryTest {
    Pyramid actualPyramid;
    Pyramid expectedPyramid;
    Point vertex  = new Point(1,2,3);


    @Test
    void createPyramid(){
        expectedPyramid = PyramidFactory.createPyramid(1,2,3,4,5 );
        actualPyramid = PyramidFactory.createPyramid(1,2,3,4,5);
        actualPyramid.setPyramidId(1);
        assertEquals(expectedPyramid, actualPyramid);
    }


    @Test
    void createPyramidByVertex() {
        actualPyramid = PyramidFactory.createPyramid(vertex, 8, 9);
        expectedPyramid = PyramidFactory.createPyramid(1, 2, 3, 4, 5);
        expectedPyramid.setPyramidId(1);
        assertEquals(expectedPyramid, actualPyramid);
    }

    @Test
    void testCreatePyramidByParameter(){
        double [] actualPyramidValues = {-2.0, 5.1, 6.3, 1.4, 2.8 };
        actualPyramid = PyramidFactory.createPyramid(actualPyramidValues);
        expectedPyramid = PyramidFactory.createPyramid(-2.0, 5.1, 6.3, 1.4, 2.8 );
        expectedPyramid.setPyramidId(1);
        assertEquals(actualPyramid, expectedPyramid);

    }
}
