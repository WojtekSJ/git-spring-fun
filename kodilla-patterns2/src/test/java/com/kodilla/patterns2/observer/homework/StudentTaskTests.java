package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskTests {

    @Test
    public void testValidation() {
        // Given
        Teacher neo = new Teacher("Neo Matrix");
        Teacher agentSmith= new Teacher("Smith Agent");
        Teacher forestGump = new Teacher("Forest Gump");

        StudentTask mathStudent = new MathStudent();
        StudentTask physicStudent = new PhysicStudent();

        mathStudent.registerObserver(neo);
        mathStudent.registerObserver(agentSmith);
        mathStudent.registerObserver(forestGump);
        physicStudent.registerObserver(neo);
        // When
        mathStudent.addTask("First exam!");
        mathStudent.addTask("Homework Java to be verified.");
        physicStudent.addTask("Task for physic homework");
        physicStudent.addTask("Task 2");
        physicStudent.addTask("Final exam.");
        // Then
        assertEquals(5, neo.getTaskUpdates());
        assertEquals(2, agentSmith.getTaskUpdates());
        assertEquals(2, forestGump.getTaskUpdates());
    }
}
