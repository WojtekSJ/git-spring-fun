package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String name;
    private boolean isExecuted;

    public PaintingTask(String name) {
        this.name = name;
        this.isExecuted = false;
    }

    @Override
    public void executeTask() {
        this.isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return name;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
