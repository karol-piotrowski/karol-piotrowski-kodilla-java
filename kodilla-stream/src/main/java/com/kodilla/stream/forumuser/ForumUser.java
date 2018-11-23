package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uuid;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publishedPostsCount;

    public ForumUser(final int uuid, final String username, final char sex, final LocalDate dateOfBirth, final int publishedPostsCount) {
        this.uuid = uuid;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.publishedPostsCount = publishedPostsCount;
    }

    public int getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPostsCount() {
        return publishedPostsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uuid=" + uuid +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPostsCount=" + publishedPostsCount +
                '}';
    }
}
