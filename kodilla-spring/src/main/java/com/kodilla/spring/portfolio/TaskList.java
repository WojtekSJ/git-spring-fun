package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;
    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String text) {
        tasks.add(text);
    }

    public void readTasks() {
        for(String temp: tasks) {
            System.out.println(temp);
        }
    }
}
