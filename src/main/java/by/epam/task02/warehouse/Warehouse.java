package by.epam.task02.warehouse;


import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static  final  Warehouse instance = new Warehouse();
    private  final Map<Long , PyramidParameter> pyramidMap  = new HashMap<>();

    public Warehouse() {
    }

    public  static Warehouse getInstance(){
        return instance;
    }


    public void updateParameters(long id, double area, double perimeterBase, double height) {
    }
}
