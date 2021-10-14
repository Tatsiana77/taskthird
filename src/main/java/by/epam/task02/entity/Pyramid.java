package by.epam.task02.entity;

import by.epam.task02.observer.PyramidEvent;
import by.epam.task02.observer.PyramidObservable;
import by.epam.task02.observer.PyramidObserver;
import by.epam.task02.util.ShapeIdGenerator;

import java.util.ArrayList;


public class Pyramid implements PyramidObservable {
    private final long pyramidId;
    private Point vertex;
    private Point base1;
    private Point base2;
    private Point base3;
    private Point base4;
    private final ArrayList<PyramidObserver> observers = new ArrayList<>();

    public Pyramid() {
        this.vertex = new Point();
        this.base1 = new Point();
        this.base2 = new Point();
        this.base3 = new Point();
        this.base4 = new Point();
        this.pyramidId = ShapeIdGenerator.generateId();
    }

    public Point getVertex() {
        return vertex;
    }

    public void setVertex(Point vertex) {
        this.vertex = vertex;
    }

    public Point getBase1() {
        return base1;
    }

    public void setBase1(Point base1) {
        this.base1 = base1;
    }

    public Point getBase2() {
        return base2;
    }

    public void setBase2(Point base2) {
        this.base2 = base2;
    }

    public Point getBase3() {
        return base3;
    }

    public void setBase3(Point base3) {
        this.base3 = base3;
    }

    public Point getBase4() {
        return base4;
    }

    public void setBase4(Point base4) {
        this.base4 = base4;
    }

    public long getPyramidId() {
        return pyramidId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid pyramid = (Pyramid) o;
        return pyramid.vertex.equals(vertex) &&
                pyramid.base1.equals(base1) &&
                pyramid.base2.equals(base2) &&
                pyramid.base3.equals(base3) &&
                pyramid.base4.equals(base4);
    }


    @Override
    public void attach(PyramidObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(PyramidObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (PyramidObserver observer : observers) {
            if (observer == null) {
                continue;
            }
            PyramidEvent event = new PyramidEvent(this);
            observer.parameterChanged(event);
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        result += result * 31 + base1.hashCode();
        result += result * 31 + base2.hashCode();
        result += result * 31 + base3.hashCode();
        result += result * 31 + base4.hashCode();
        result += result * 31 + vertex.hashCode();
        return result;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ellipse{");
        sb.append("pyramidId=").append(pyramidId);
        sb.append(", vertex=").append(vertex);
        sb.append(", base1=").append(base1);
        sb.append(", base2=").append(base2);
        sb.append(", base3=").append(base3);
        sb.append(", base4=").append(base4);
        sb.append('}');
        return sb.toString();
    }
}
