package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.Driving);
        //Then
        assertEquals("Driving action", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());
    }
    @Test
    void testTaskPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.Painting);
        //Then
        assertEquals("Paint something", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testTaskShoping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoping = taskFactory.makeTask(TaskFactory.Shoping);
        //Then
        assertEquals("Buy something", shoping.getTaskName());
        assertEquals(false, shoping.isTaskExecuted());
    }

    @Test
    void testTaskShopingExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoping = taskFactory.makeTask(TaskFactory.Shoping);
        System.out.println("Task execution status: " + shoping.isTaskExecuted() + " then after execution -> ");
        shoping.executeTask();
        System.out.print(shoping.isTaskExecuted());
        //Then
        assertEquals("Buy something", shoping.getTaskName());
        assertEquals(true, shoping.isTaskExecuted());
    }

}
