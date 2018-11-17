package com.kodilla.testing.forum.statistics;

import java.text.DecimalFormat;

public class AdvStatistics {
    private int userCount;
    private int postCount;
    private int commentsCount;
    private double avgPostsPerUser = 0;
    private double avgCommentsPerUser = 0;
    private double avgCommentsPerPost = 0;

    public void calculateAdvStatistics(Statistics statistics) { // divide by 0 values will be calculated as 0
        userCount = statistics.usersNames().size();
        postCount = statistics.postCount();
        commentsCount = statistics.commentsCount();

        if (userCount != 0) {
            avgPostsPerUser = (double) postCount / userCount;
            avgCommentsPerUser = (double) commentsCount / userCount;
        }

        if (postCount != 0) {
            avgCommentsPerPost = (double) commentsCount / postCount;
        }

    }

    public String showStatistics() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Number of users: " + userCount + ", Number of posts: " + postCount + ", Number of comments: " + commentsCount + ", Average posts per user: " + df.format(avgPostsPerUser) + ", Average comments per user: " + df.format(avgCommentsPerUser) + ", Average comments per post: " + df.format(avgCommentsPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
