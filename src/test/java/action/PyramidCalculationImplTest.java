package action;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import by.epam.task02.factory.PyramidFactory;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class PyramidCalculationImplTest {
    PyramidCalculationImpl calculation = new PyramidCalculationImpl();


    @Test
    void pyramidArea() {
        Pyramid pyramid = PyramidFactory.createPyramid(1,2,3,4,5);
        double actualArea = calculation.pyramidArea(pyramid);
        double expectedArea = 27.71;
    }

    @Test
    void pyramidVolume() {
        Pyramid pyramid = PyramidFactory.createPyramid(1,2,3,4,5);
        double actualVolume =calculation.pyramidVolume(pyramid);
        double expectedVolume = 7.54;
        assertEquals(actualVolume, expectedVolume, 0.01);
    }

    @Test
    void  pyramidVolumeRatio() throws PyramidException{
        Point point = new Point(1,2,3);
        Pyramid pyramid = PyramidFactory.createPyramid(1,2,3,4,5);
        double actualVolumeRatio  = calculation.pyramidVolumeRatio(pyramid,point);
        double expectedVolumeRatio  = 1.78;
        assertEquals(actualVolumeRatio, expectedVolumeRatio, 0.01);
    }

    @Test
    void isPyramid(){
        boolean isPyramid = calculation.isPyramid(4, -5);
        assertFalse(isPyramid);
    }

    @Test
    void isBaseOnPlain() {
        Pyramid pyramid = PyramidFactory.createPyramid(0,3 , 0,7, 2);
        calculation.isBaseOnPlane(pyramid);
        boolean isBaseOnPlain = calculation.isBaseOnPlane(pyramid);
        assertTrue(isBaseOnPlain);
    }
}
