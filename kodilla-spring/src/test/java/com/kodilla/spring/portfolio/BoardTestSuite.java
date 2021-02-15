package com.kodilla.spring.portfolio;

import com.kodilla.spring.library.Library;
import com.kodilla.spring.reader.ReaderConfig;
import com.kodilla.spring.shape.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {


        @Autowired
        private Board board;
        @Test
        void testContext() {
                //Given
                ApplicationContext context =
                        new AnnotationConfigApplicationContext("com.kodilla.spring");

                //When & Then
                System.out.println("===== Beans list: ==== >>");
                Arrays.stream(context.getBeanDefinitionNames())
                        .forEach(System.out::println);
                System.out.println("<< ===== Beans list ====");
        }


        @Test
        void testTaskAdd() {
                //Given
                ApplicationContext context =
                        new AnnotationConfigApplicationContext("com.kodilla.spring");
                Board board = (Board)context.getBean("getBoard");

                //When
                board.adddoneList("Task do done list");
                board.adddoneList("Task do done list2");
                board.adddoneList("Task do done list3");
                board.addinProgressList ("Task in progress list");
                board.addToDoList  ("Task in To Do list");

                //Then
                board.toDoList.readTasks();
                board.doneList.readTasks();
                board.inProgressList.readTasks();
        }

}
