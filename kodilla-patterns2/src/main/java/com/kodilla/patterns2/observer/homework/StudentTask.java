package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentTask implements ObservableQueue{
    private final List<ObserverTeacher> observerTeacher;
    private final List<String> task;
    private final String name;

    public StudentTask(String name) {
        observerTeacher = new ArrayList<>();
        task = new LinkedList<>();
        this.name = name;

    }
    public void addTask(String task) {
        this.task.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverTeacher observerTeacher) {
    this.observerTeacher.add(observerTeacher);
    }

    @Override
    public void notifyObservers() {
        for (ObserverTeacher observerTeacher : observerTeacher) {
            observerTeacher.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverTeacher observerTeacher) {
    this.observerTeacher.remove(observerTeacher);
    }

    public List<ObserverTeacher> getObserverTeacher() {
        return observerTeacher;
    }

    public List<String> getTask() {
        return task;
    }

    public String getName() {
        return name;
    }
}
