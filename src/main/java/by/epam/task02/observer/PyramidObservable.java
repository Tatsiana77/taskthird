package by.epam.task02.observer;

import by.epam.task02.exception.PyramidException;

public interface PyramidObservable {
    void attach(PyramidObserver observer);
    void detach(PyramidObserver observer);
    void notifyObservers() throws PyramidException;
}
