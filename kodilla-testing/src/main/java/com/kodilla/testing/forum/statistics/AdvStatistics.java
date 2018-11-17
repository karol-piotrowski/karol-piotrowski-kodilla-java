package com.kodilla.testing.forum.statistics;

import java.text.DecimalFormat;

public class AdvStatistics {
    private int userCount;
    private int postCount;
    private int commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) { // divide by 0 values will be calculated as 0
        userCount = statistics.usersNames().size();
        postCount = statistics.postCount();
        commentsCount = statistics.commentsCount();
        if (userCount == 0 && postCount == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
            avgCommentsPerPost = 0;
        } else if (userCount == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
            avgCommentsPerPost = (double) commentsCount / postCount;
        } else if (postCount == 0) {
            avgPostsPerUser = (double) postCount / userCount;
            avgCommentsPerUser = (double) commentsCount / userCount;
            avgCommentsPerPost = 0;
        } else {
            avgPostsPerUser = (double) postCount / userCount;
            avgCommentsPerUser = (double) commentsCount / userCount;
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
