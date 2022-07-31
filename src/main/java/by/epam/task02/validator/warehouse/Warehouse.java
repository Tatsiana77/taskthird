package by.epam.task02.validator.warehouse;


import by.epam.task02.exception.PyramidException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Logger logger = LogManager.getLogger();

    private static Warehouse instance = new Warehouse();
    private Map<Long, PyramidParameter> pyramidMap = new HashMap<>();

    public Warehouse() {
        this.pyramidMap = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public PyramidParameter putById(Long pyramidId, PyramidParameter pyramidParameter) {
        return pyramidMap.put(pyramidId, pyramidParameter);
    }

    public PyramidParameter removeById(Long pyramidId) {
        return pyramidMap.remove(pyramidId);
    }

    public PyramidParameter getById(Long pyramidId) throws PyramidException {
        PyramidParameter pyramidParameter = pyramidMap.get(pyramidId);
        if (pyramidParameter == null) {
            logger.log(Level.ERROR, " no such element by id " + pyramidId);
            throw new PyramidException(" no such element by id " + pyramidId);
        }
        return pyramidParameter;
    }

    public int warehouseSize() {
        return pyramidMap.size();
    }

}
