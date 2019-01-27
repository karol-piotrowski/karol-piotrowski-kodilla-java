package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TestFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        // Then
        Assert.assertEquals("Executing shopping task Shopping - Buy: 2.0*Bottle of water.", shoppingTask.executeTask());

    }

    @Test
    public void testFactoryPaintingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);

        // Then
        Assert.assertEquals("Executing painting task Painting - Paint House with Red color.", paintingTask.executeTask());
    }

    @Test
    public void testFactoryDrivingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);

        // Then
        Assert.assertEquals("Executing driving task Driving - Drive to Kraków using Car.", drivingTask.executeTask());
    }
}
