package observer;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.service.CustomRepositoryService;
import by.epam.task02.validator.warehouse.PyramidParameter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class PyramidObserverImplTest {
    Point point  = new Point(1,2,3);
    Pyramid pyramid = new Pyramid(point, 2,3);
    CustomRepositoryService repositoryService = new CustomRepositoryService();


    @Test
    void updatePyramidVolume(){
        repositoryService.fillConeRepository(point, 2,3);
        PyramidCalculationImpl calculation = new PyramidCalculationImpl();
        PyramidParameter parameter = new PyramidParameter(calculation.pyramidArea(pyramid),
                calculation.pyramidVolume(pyramid));
        parameter.setVolume(24);
        assertEquals(parameter.getVolume(),24);
    }

    @Test
    void updateArea(){
        repositoryService.fillConeRepository(point, 2,3);
        PyramidCalculationImpl calculation = new PyramidCalculationImpl();
        PyramidParameter parameter = new PyramidParameter(calculation.pyramidArea(pyramid),
                calculation.pyramidArea(pyramid));
        parameter.setArea(17);
        assertEquals(parameter.getArea(),17);
    }

}
