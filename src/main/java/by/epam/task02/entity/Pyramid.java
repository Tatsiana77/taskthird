package by.epam.task02.entity;

import by.epam.task02.observer.PyramidEvent;
import by.epam.task02.observer.PyramidObservable;
import by.epam.task02.observer.PyramidObserver;
import by.epam.task02.util.ShapeIdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Pyramid implements PyramidObservable {
    private long pyramidId;
    private Point vertex;
    private double height;
    private double sideLength;
    private final List<PyramidObserver> observers = new ArrayList<>();

    public Pyramid() {
        pyramidId = ShapeIdGenerator.generateId();
    }

    public Pyramid(Point vertex, double height, double sideLength) {
        this.vertex = vertex;
        this.height = height;
        this.sideLength = sideLength;
    }

    public long getPyramidId() {
        return pyramidId;
    }

    public Point getVertex() {
        return vertex;
    }

    public void setVertex(Point vertex) {
        this.vertex = vertex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public List<PyramidObserver> getObservers() {
        return observers;
    }

    public void setPyramidId(long pyramidId) {
        this.pyramidId = pyramidId;
    }

    @Override
    public void attach(PyramidObserver observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(PyramidObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        PyramidEvent event = new PyramidEvent(this);
        if (!observers.isEmpty()) {
            for (PyramidObserver observer : observers) {
                observer.updateArea(event);
                observer.updatePyramidVolume(event);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pyramid)) return false;
        Pyramid pyramid = (Pyramid) o;
        return getPyramidId() == pyramid.getPyramidId() &&
                Double.compare(pyramid.getSideLength(), getSideLength()) == 0 &&
                Objects.equals(getVertex(), pyramid.getVertex()) &&
                Objects.equals(getHeight(), pyramid.getHeight()) &&
                Objects.equals(getObservers(), pyramid.getObservers());
    }

    @Override
    public int hashCode() {
        int result = this.vertex.hashCode();
        long longBits = Double.doubleToLongBits(this.sideLength);
        result = 31 * result + (int) (longBits - (longBits >>> 32));
        longBits = Double.doubleToLongBits(this.height);
        result = 31 * result + (int) (longBits - (longBits >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("pyramidId=").append(pyramidId);
        sb.append(", vertex =").append(vertex);
        sb.append(", sideLength =").append(sideLength);
        sb.append(", height =").append(height);
        sb.append('}');
        return sb.toString();
    }

}
