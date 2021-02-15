package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList list1;
    @Autowired
    @Qualifier("inProgressList")
    TaskList list2;
    @Autowired
    @Qualifier("doneList")
    TaskList list3;

    @Bean
    public Board getBoard() {
        return new Board(list1, list2, list3);
    }


    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList gettoDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getinProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getdoneList() {
        return new TaskList();
    }
}
