package com.kodilla.patterns2.observer.homework;

public interface ObservableQueue {
    void registerObserver(ObserverTeacher observerTeacher);
    void notifyObservers();
    void removeObserver(ObserverTeacher observerTeacher);
}
