package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("Log 1");
        logger.log("Log 2");
        logger.log("Log 3");
        //Then
        Assert.assertEquals("Log 3", logger.getLastLog());
    }

    @Test
    public void testGetLastLogAfterGettingInstance() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("Log 1");
        logger.log("Log 2");
        logger.log("Log 3");
        logger = Logger.getInstance();
        //Then
        Assert.assertEquals("Log 3", logger.getLastLog());
    }

    @Test
    public void testGetLastLogFromDifferentObjectReference() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("Log 1");
        logger.log("Log 2");
        logger.log("Log 3");
        Logger otherLogger = Logger.getInstance();
        //Then
        Assert.assertEquals("Log 3", otherLogger.getLastLog());
    }
}
