package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    private TaskList taskList1;
    @Autowired
    @Qualifier("inProgressList")
    private TaskList taskList2;
    @Autowired
    @Qualifier("doneList")
    private TaskList taskList3;


    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        TaskList toDoList = new TaskList();
        toDoList.addTask("To do task 1");
        toDoList.addTask("To do task 2");
        return toDoList;
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        TaskList inProgressList = new TaskList();
        inProgressList.addTask("In progress task 1");
        inProgressList.addTask("In progress task 2");
        return inProgressList;
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        TaskList doneList = new TaskList();
        doneList.addTask("Done task 1");
        doneList.addTask("Done task 2");
        return doneList;
    }

    @Bean
    public Board getBoard() {
        return new Board(taskList1, taskList2, taskList3);
    }
}
