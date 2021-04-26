package com.kodilla.patterns2.observer.homework;

public class Teacher implements ObserverTeacher{
    private final String username;
    private int taskUpdates;

    public Teacher(String username) {
        this.username = username;
        this.taskUpdates = 0;
    }


    @Override
    public void update(StudentTask studentTask) {
        System.out.println(username + ": Task in Student queue " + studentTask.getName() + "\n" +
                " (total: " + studentTask.getTask().size() + " task to be checked)");
        taskUpdates++;
    }

    public String getUsername() {
        return username;
    }

    public int getTaskUpdates() {
        return taskUpdates;
    }
}
