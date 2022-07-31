package by.epam.task02.comparator;

import by.epam.task02.entity.Pyramid;

import java.util.Comparator;

public class PyramidFirstCoordinateComparator  implements Comparator<Pyramid> {
    @Override
    public int compare(Pyramid o1, Pyramid o2) {
        return  Double.compare(o1.getVertex().getX(), o2.getVertex().getX());
    }
}
