package by.epam.task02.service;

import by.epam.task02.action.impl.PyramidCalculationImpl;
import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.factory.PyramidFactory;
import by.epam.task02.validator.warehouse.PyramidParameter;
import by.epam.task02.validator.warehouse.Warehouse;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomWarehouseService {
    private static final Logger logger = LogManager.getLogger();

    public void fillConeWarehouse(Pyramid pyramid) {
        long id = pyramid.getPyramidId();
        PyramidCalculationImpl calculationService = new PyramidCalculationImpl();
        double pyramidArea = calculationService.pyramidArea(pyramid);
        double volume = calculationService.pyramidVolume(pyramid);
        PyramidParameter parameters = new PyramidParameter(pyramidArea, volume);
        Warehouse warehouse = new Warehouse();
        warehouse.putById(id, parameters);
        logger.log(Level.INFO, "add cone " + pyramid + " to warehouse");
    }

    public void fillConeWarehouse(Point vertex, double sideLength, double height) {
        Pyramid pyramid = PyramidFactory.createPyramid(vertex, sideLength, height);
        fillConeWarehouse(pyramid);
    }

    public void fillConeWarehouse(double[] array) {
        Pyramid pyramid = PyramidFactory.createPyramid(array);
        fillConeWarehouse(pyramid);
    }
}
