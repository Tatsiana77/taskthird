package by.epam.task02.warehouse;

import java.util.Objects;

public class PyramidParameter {
    private double area;
    private double height;
    private double perimeterBase;

    public PyramidParameter() {
    }

    public PyramidParameter(double area, double height, double perimeterBase) {
        this.area = area;
        this.height = height;
        this.perimeterBase = perimeterBase;
    }

    public PyramidParameter(PyramidParameter data) {
        perimeterBase = data.perimeterBase;
        area = data.area;
        height = data.height;
    }

    public double getArea() {
        return area;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeterBase() {
        return perimeterBase;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPerimeterBase(double perimeterBase) {
        this.perimeterBase = perimeterBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PyramidParameter that = (PyramidParameter) o;
        return Double.compare(that.getArea(), getArea()) == 0 && Double.compare(that.getHeight(), getHeight()) == 0 && Double.compare(that.getPerimeterBase(), getPerimeterBase()) == 0;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result += 31 * result + Double.hashCode(perimeterBase);
        result += 31 * result + Double.hashCode(area);
        result += 31 * result + Double.hashCode(height);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EllipseParameter{");
        sb.append("perimeterBase=").append(perimeterBase);
        sb.append(", area=").append(area);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
