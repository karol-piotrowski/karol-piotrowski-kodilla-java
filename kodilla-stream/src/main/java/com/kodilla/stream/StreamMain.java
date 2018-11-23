package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

//      USING TWO STREAMS
//        Map<Integer, ForumUser> theResultMap = theForum.getUserList().stream()
//                .filter(forumUser -> forumUser.getSex() == 'M' && Period.between(forumUser.getDateOfBirth(),LocalDate.now()).getYears()>=20 && forumUser.getPublishedPostsCount()>=1)
//                .collect(Collectors.toMap(ForumUser::getUuid, ForumUser -> ForumUser));
//
//        System.out.println("# elements: " + theResultMap.size());
//        theResultMap.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//      USING SINGLE STREAM
        theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M' && Period.between(forumUser.getDateOfBirth(),LocalDate.now()).getYears()>=20 && forumUser.getPublishedPostsCount()>=1)
                .collect(Collectors.toMap(ForumUser::getUuid, ForumUser -> ForumUser))
                .entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
