package by.epam.task02.observer;

public interface PyramidObservable {
    void attach(PyramidObserver observer);
    void detach(PyramidObserver observer);
    void notifyObservers();
}
