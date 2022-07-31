package service;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.factory.PyramidFactory;
import by.epam.task02.service.CustomWarehouseService;
import by.epam.task02.validator.warehouse.PyramidParameter;
import by.epam.task02.validator.warehouse.Warehouse;

public class CustomRepositoryServiceTest {

    @Test
    void fillConeRepository() {
        Pyramid pyramid = PyramidFactory.createPyramid(1, 2, 3, 4, 5);
        PyramidCalculationImpl calculation = new PyramidCalculationImpl();
        PyramidParameter parameter = new PyramidParameter(calculation.pyramidArea(pyramid), calculation.pyramidVolume(pyramid));
        Warehouse warehouse = new Warehouse();
        warehouse.putById(4L, parameter);
        CustomWarehouseService filler = new CustomWarehouseService();
        filler.fillConeWarehouse(pyramid);
        int expectedWarehouseSize = 1;
        assertEquals(expectedWarehouseSize, warehouse.warehouseSize())
    }

}
