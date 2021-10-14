package by.epam.task02.filler;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;
import by.epam.task02.service.PyramidService;
import by.epam.task02.service.PyramidServiceImpl;
import by.epam.task02.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class WareHouseFiller {
    private static final Logger logger = LogManager.getLogger();

    public  void fillWarehouse(List<Pyramid> pyramids) throws PyramidException{
        PyramidService service = new PyramidServiceImpl();
        Warehouse warehouse = Warehouse.getInstance();
        for (Pyramid pyramid : pyramids) {
            double perimeterBase = service.calcPerimeterBase(pyramid);
            double area = service.calcArea(pyramid);
            double height = service.calcHeight(pyramid);

        }


    }

}
