package by.epam.task02.observer.impl;

import by.epam.task02.action.impl.PyramidCalculationImpl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import by.epam.task02.observer.PyramidEvent;
import by.epam.task02.observer.PyramidObserver;
import by.epam.task02.validator.warehouse.PyramidParameter;
import by.epam.task02.validator.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PyramidObserverImpl implements PyramidObserver {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void updatePyramidVolume(PyramidEvent event) {
        try {
            Pyramid pyramid = event.getSource();
            long id = pyramid.getPyramidId();
            Warehouse warehouse = Warehouse.getInstance();
            PyramidParameter pyramidParameter;
            pyramidParameter = warehouse.getById(id);
            PyramidCalculationImpl calculation = new PyramidCalculationImpl();
            double volume = calculation.pyramidVolume(pyramid);
            pyramidParameter.setVolume(volume);
        } catch (PyramidException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void updateArea(PyramidEvent event) {
        try {
            Pyramid pyramid = event.getSource();
            long id = pyramid.getPyramidId();
            Warehouse warehouse = Warehouse.getInstance();
            PyramidParameter pyramidParameter;
            pyramidParameter = warehouse.getById(id);
            PyramidCalculationImpl calculation = new PyramidCalculationImpl();
            double area = calculation.pyramidArea(pyramid);
            pyramidParameter.setArea(area);
        } catch (PyramidException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
