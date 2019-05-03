package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue queueAdam = new TaskQueue("Adam Adamowicz");
        TaskQueue queueBartek = new TaskQueue("Bartosz Bartoszewski");
        TaskQueue queueCelina = new TaskQueue("Celina Celińska");
        TaskQueue queueDominik = new TaskQueue("Dominik Domin");
        Mentor mentorWojtek = new Mentor("Wojciech Wojciechowski");
        Mentor mentorZenek = new Mentor("Zenon Zenonik");

        queueAdam.registerObserver(mentorWojtek);
        queueBartek.registerObserver(mentorZenek);
        queueCelina.registerObserver(mentorWojtek);
        queueCelina.registerObserver(mentorZenek);
        queueDominik.registerObserver(mentorZenek);

        //When
        queueAdam.addTask("Task 1");
        queueAdam.addTask("Task 2");
        queueAdam.addTask("Task 3");
        queueBartek.addTask("Task 1");
        queueBartek.addTask("Task 2");
        queueCelina.addTask("Task 1");
        queueDominik.addTask("Task 1");
        queueDominik.addTask("Task 2");
        queueDominik.addTask("Task 3");
        queueDominik.addTask("Task 4");

        //Then
        assertEquals(4, mentorWojtek.getUpdateCount());
        assertEquals(7, mentorZenek.getUpdateCount());
    }
}