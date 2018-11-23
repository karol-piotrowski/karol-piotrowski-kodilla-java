package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(0, "neo", 'M', LocalDate.of(1988, 3, 15), 6));
        theUserList.add(new ForumUser(1, "trinity", 'F', LocalDate.of(1999, 8, 8), 2));
        theUserList.add(new ForumUser(2, "morpheus", 'M', LocalDate.of(1975, 12, 9), 45));
        theUserList.add(new ForumUser(3, "grazyna", 'F', LocalDate.of(1958, 1, 3), 38));
        theUserList.add(new ForumUser(4, "yanush", 'M', LocalDate.of(1950, 11, 29), 61));
        theUserList.add(new ForumUser(5, "seba", 'M', LocalDate.of(2001, 5, 10), 3));
        theUserList.add(new ForumUser(6, "karyna", 'F', LocalDate.of(2002, 6, 8), 0));
        theUserList.add(new ForumUser(7, "bryan", 'M', LocalDate.of(1995, 7, 7), 4));
        theUserList.add(new ForumUser(8, "jessica", 'F', LocalDate.of(1996, 9, 1), 9));
        theUserList.add(new ForumUser(9, "cypher", 'M', LocalDate.of(1980, 2, 29), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }

}
