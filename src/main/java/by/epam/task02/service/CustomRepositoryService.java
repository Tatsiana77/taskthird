package by.epam.task02.service;

import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.factory.PyramidFactory;
import by.epam.task02.repository.impl.ConeRepositoryImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomRepositoryService {
    private static final Logger logger = LogManager.getLogger();

    public void fillConeRepository(Point vertex, double sideLength, double height) {
        Pyramid pyramid = PyramidFactory.createPyramid(vertex, sideLength, height);
        ConeRepositoryImpl repository = ConeRepositoryImpl.getInstance();
        repository.addPyramid(pyramid);
        CustomWarehouseService filler = new CustomWarehouseService();
        filler.fillConeWarehouse(pyramid);
        logger.log(Level.INFO, "add cone " + pyramid + "to repository");
    }

    public void fillConeRepository(double[] array) {
        Pyramid pyramid = PyramidFactory.createPyramid(array);
        ConeRepositoryImpl repository = ConeRepositoryImpl.getInstance();
        repository.addPyramid(pyramid);
        CustomWarehouseService filler = new CustomWarehouseService();
        filler.fillConeWarehouse(pyramid);
        logger.log(Level.INFO, "add cone " + pyramid + " to repository");

    }

}
