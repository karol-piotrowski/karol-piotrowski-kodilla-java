package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculateAdvStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsForZeroPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("John Doe");
        usersNames.add("Mary Smith");
        usersNames.add("Robert Lee");
        usersNames.add("George Orwell");
        usersNames.add("Miles Davis");
        usersNames.add("Tina Turner");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(51);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(6, advStatistics.getUserCount());
        Assert.assertEquals(0, advStatistics.getPostCount());
        Assert.assertEquals(51, advStatistics.getCommentsCount());
        Assert.assertEquals(0, advStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(8.5, advStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, advStatistics.getAvgCommentsPerPost(), 0);
        Assert.assertEquals("Number of users: 6, Number of posts: 0, Number of comments: 51, Average posts per user: 0, Average comments per user: 8.5, Average comments per post: 0", advStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsFor1000Posts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("John Doe");
        usersNames.add("Mary Smith");
        usersNames.add("Robert Lee");
        usersNames.add("George Orwell");
        usersNames.add("Miles Davis");
        usersNames.add("Tina Turner");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2400);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(6, advStatistics.getUserCount());
        Assert.assertEquals(1000, advStatistics.getPostCount());
        Assert.assertEquals(2400, advStatistics.getCommentsCount());
        Assert.assertEquals(166.67, advStatistics.getAvgPostsPerUser(), 0.007);
        Assert.assertEquals(400, advStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(2.4, advStatistics.getAvgCommentsPerPost(), 0);
        Assert.assertEquals("Number of users: 6, Number of posts: 1000, Number of comments: 2400, Average posts per user: 166.67, Average comments per user: 400, Average comments per post: 2.4", advStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsForZeroComments() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("John Doe");
        usersNames.add("Mary Smith");
        usersNames.add("Robert Lee");
        usersNames.add("George Orwell");
        usersNames.add("Miles Davis");
        usersNames.add("Tina Turner");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(612);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(6, advStatistics.getUserCount());
        Assert.assertEquals(612, advStatistics.getPostCount());
        Assert.assertEquals(0, advStatistics.getCommentsCount());
        Assert.assertEquals(102, advStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, advStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, advStatistics.getAvgCommentsPerPost(), 0);
        Assert.assertEquals("Number of users: 6, Number of posts: 612, Number of comments: 0, Average posts per user: 102, Average comments per user: 0, Average comments per post: 0", advStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsForCommentsLessThanPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("John Doe");
        usersNames.add("Mary Smith");
        usersNames.add("Robert Lee");
        usersNames.add("George Orwell");
        usersNames.add("Miles Davis");
        usersNames.add("Tina Turner");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(612);
        when(statisticsMock.commentsCount()).thenReturn(300);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(6, advStatistics.getUserCount());
        Assert.assertEquals(612, advStatistics.getPostCount());
        Assert.assertEquals(300, advStatistics.getCommentsCount());
        Assert.assertEquals(102, advStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(50, advStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0.49, advStatistics.getAvgCommentsPerPost(), 0.005);
        Assert.assertEquals("Number of users: 6, Number of posts: 612, Number of comments: 300, Average posts per user: 102, Average comments per user: 50, Average comments per post: 0.49", advStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsForCommentsMoreThanPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("John Doe");
        usersNames.add("Mary Smith");
        usersNames.add("Robert Lee");
        usersNames.add("George Orwell");
        usersNames.add("Miles Davis");
        usersNames.add("Tina Turner");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(612);
        when(statisticsMock.commentsCount()).thenReturn(815);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(6, advStatistics.getUserCount());
        Assert.assertEquals(612, advStatistics.getPostCount());
        Assert.assertEquals(815, advStatistics.getCommentsCount());
        Assert.assertEquals(102, advStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(135.83, advStatistics.getAvgCommentsPerUser(), 0.005);
        Assert.assertEquals(1.33, advStatistics.getAvgCommentsPerPost(), 0.005);
        Assert.assertEquals("Number of users: 6, Number of posts: 612, Number of comments: 815, Average posts per user: 102, Average comments per user: 135.83, Average comments per post: 1.33", advStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsForZeroUsers() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(4);
        when(statisticsMock.commentsCount()).thenReturn(8);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(0, advStatistics.getUserCount());
        Assert.assertEquals(4, advStatistics.getPostCount());
        Assert.assertEquals(8, advStatistics.getCommentsCount());
        Assert.assertEquals(0, advStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(0, advStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(2, advStatistics.getAvgCommentsPerPost(), 0);
        Assert.assertEquals("Number of users: 0, Number of posts: 4, Number of comments: 8, Average posts per user: 0, Average comments per user: 0, Average comments per post: 2", advStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsFor100Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
            for(int i=0; i<100; i++){
                usersNames.add("User #" + (i+1));
            }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postCount()).thenReturn(656);
        when(statisticsMock.commentsCount()).thenReturn(1298);

        // When
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(100, advStatistics.getUserCount());
        Assert.assertEquals(656, advStatistics.getPostCount());
        Assert.assertEquals(1298, advStatistics.getCommentsCount());
        Assert.assertEquals(6.56, advStatistics.getAvgPostsPerUser(), 0);
        Assert.assertEquals(12.98, advStatistics.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(1.98, advStatistics.getAvgCommentsPerPost(), 0.005);
        Assert.assertEquals("Number of users: 100, Number of posts: 656, Number of comments: 1298, Average posts per user: 6.56, Average comments per user: 12.98, Average comments per post: 1.98", advStatistics.showStatistics());
    }


}
