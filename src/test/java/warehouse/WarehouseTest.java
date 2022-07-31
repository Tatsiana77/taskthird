package warehouse;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import by.epam.task02.factory.PyramidFactory;
import by.epam.task02.validator.warehouse.PyramidParameter;
import by.epam.task02.validator.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

i

public class WarehouseTest {
    private static final Logger logger = LogManager.getLogger();
    PyramidCalculationImpl calculation = new PyramidCalculationImpl();
    Warehouse warehouse = new Warehouse();
    Pyramid pyramid = PyramidFactory.createPyramid(3, 2, 5, 2, 6);

    @BeforeTest
    @Test
    void putById() {
        double pyramidVolume = calculation.pyramidVolume(pyramid);
        double pyramidArea = calculation.pyramidArea(pyramid);
        PyramidParameter parameter = new PyramidParameter(pyramidVolume, pyramidArea);
        warehouse.putById(1L, parameter);
        assertEquals(1, warehouse.warehouseSize());
    }

    @Test
    void getById() {
        try {
            double pyramidVolume = calculation.pyramidVolume(pyramid);
            double pyramidArea = calculation.pyramidArea(pyramid);
            PyramidParameter expectedParameters = new PyramidParameter(pyramidVolume, pyramidArea);
            assertEquals(warehouse.getById(1L), expectedParameters);
        } catch (PyramidException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
