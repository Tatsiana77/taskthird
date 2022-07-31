package by.epam.task02.comparator;


import by.epam.task02.entity.Pyramid;

import java.util.Comparator;

public class PyramidIdComparator implements Comparator<Pyramid> {
    @Override
    public int compare(Pyramid o1, Pyramid o2) {
        int result = 0;
        if(o1.getPyramidId() - o2.getPyramidId() < 0) {
            result = -1;
        }   else if (o1.getPyramidId()- o2.getPyramidId()> 0) {
                result = 1;
            }
            return result;
    }
}
