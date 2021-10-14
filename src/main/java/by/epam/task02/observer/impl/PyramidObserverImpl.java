package by.epam.task02.observer.impl;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import by.epam.task02.observer.PyramidEvent;
import by.epam.task02.observer.PyramidObserver;
import by.epam.task02.service.PyramidService;
import by.epam.task02.service.PyramidServiceImpl;
import by.epam.task02.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PyramidObserverImpl implements PyramidObserver {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(PyramidEvent event) {
        double area = 0;
        double height = 0;
        double perimeterBase = 0;
        PyramidService service = new PyramidServiceImpl();
        Pyramid pyramid = event.getSource();
        try {
            perimeterBase = service.calcPerimeterBase(pyramid);
            area = service.calcArea(pyramid);
            height = service.calcHeight(pyramid);
        } catch (PyramidException e) {
            e.printStackTrace();
        }

        long id = pyramid.getPyramidId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.updateParameters(id, area, perimeterBase, height);
    }
}
