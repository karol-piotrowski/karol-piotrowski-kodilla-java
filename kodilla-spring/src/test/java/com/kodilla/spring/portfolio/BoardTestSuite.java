package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Extra ToDo Task");
        board.getInProgressList().addTask("Extra InProgress Task");
        board.getDoneList().addTask("Extra Done Task");
        //Then
        System.out.println("To do list:");
        board.getToDoList().getTasks().forEach(System.out::println);
        System.out.println("In progress list:");
        board.getInProgressList().getTasks().forEach(System.out::println);
        System.out.println("Done list:");
        board.getDoneList().getTasks().forEach(System.out::println);

        Assert.assertTrue(board.getToDoList().getTasks().contains("Extra ToDo Task"));
        Assert.assertTrue(board.getInProgressList().getTasks().contains("Extra InProgress Task"));
        Assert.assertTrue(board.getDoneList().getTasks().contains("Extra Done Task"));

    }
}
