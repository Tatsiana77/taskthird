package by.epam.task02.action.impl;

import by.epam.task02.action.PyramidCalculation;
import by.epam.task02.entity.Point;
import by.epam.task02.entity.Pyramid;
import by.epam.task02.exception.PyramidException;

public class PyramidCalculationImpl  implements PyramidCalculation {
    @Override
    public double pyramidArea(Pyramid pyramid) {
        double scale = Math.pow(10,2)
        return Math.round(scale *Math.sqrt(3)* Math.pow(pyramid.getSideLength(),2))/scale;
    }

    @Override
    public double pyramidVolume(Pyramid pyramid) {
        double scale = Math.pow(10, 2);
        return Math.round(scale *(Math.pow(pyramid.getSideLength(),3*Math.sqrt(2))/12))/scale;
    }

    @Override
    public double pyramidVolumeRatio(Pyramid pyramid, Point point) throws PyramidException {
        double scale = Math.pow(10,2);
        if(point.getZ()<= pyramid.getVertex().getZ() || point.getZ()>= pyramid.getVertex().getZ() + pyramid.getHeight()){
            throw new PyramidException( "no section from point " + point.toString());
        }else{
            double secondHeight = point.getZ() - pyramid.getVertex().getZ();
            double firstHeight = pyramid.getHeight() - secondHeight;
            double firstSideLength  = firstHeight*pyramid.getSideLength()/pyramid.getHeight();
            double firstPyramidVolume = pyramidVolume(new Pyramid(pyramid.getVertex(), firstHeight, firstSideLength));
            double secondConeVolume = pyramidVolume(pyramid) - firstPyramidVolume;
            return Math.round(scale * firstPyramidVolume/ secondConeVolume)/scale;
        }

    }

    @Override
    public boolean isPyramid(double sideLength, double height) {
        return sideLength >0 && height>0;
    }

    @Override
    public boolean isBaseOnPlane(Pyramid pyramid) {
        return  pyramid.getVertex().getZ() == 0;
    }
}
