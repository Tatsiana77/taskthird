package by.epam.task02.observer;

import by.epam.task02.entity.Pyramid;

import java.util.EventObject;

public class PyramidEvent extends EventObject {

    public PyramidEvent(Object source) {
        super(source);
    }
    @Override
    public Pyramid getSource() {
        return (Pyramid) super.getSource();
    }

}
