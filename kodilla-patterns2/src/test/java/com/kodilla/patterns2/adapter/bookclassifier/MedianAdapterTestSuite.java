package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 1997, "BOOK1"));
        books.add(new Book("Author 2", "Title 2", 2010, "BOOK2"));
        books.add(new Book("Author 3", "Title 3", 2009, "BOOK3"));
        books.add(new Book("Author 4", "Title 4", 2000, "BOOK4"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(books);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(2009, publicationYearMedian);
    }
}
