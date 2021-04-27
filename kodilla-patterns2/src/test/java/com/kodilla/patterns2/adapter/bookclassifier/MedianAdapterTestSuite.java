package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testMedianPublication() {
        // Given
        Set<Book> ksiegarnia = new HashSet<>();
        ksiegarnia.add(new Book("Amadeusz Mozart", "How to play", 2009, "AM"));
        ksiegarnia.add(new Book("Author 1", "How to play", 2009, "A1"));
        ksiegarnia.add(new Book("Marcin Pudzian", "Lift higher", 2011, "MP"));
        ksiegarnia.add(new Book("Andrzej Sapkowski", "Witcher", 2001, "AS"));
        ksiegarnia.add(new Book("Tobiasz Saryn", "Stock Exchange", 2020, "TS"));
        ksiegarnia.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 2009, "AM"));
        MedianAdapter adaptMediana = new MedianAdapter();

        // When
        int median = adaptMediana.publicationYearMedian(ksiegarnia);
        // Then
        System.out.println("Median is: " + median);
        assertEquals(median, 2009, 0);                  // [4]
    }
}
