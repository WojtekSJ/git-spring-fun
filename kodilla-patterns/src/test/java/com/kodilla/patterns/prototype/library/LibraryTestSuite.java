package com.kodilla.patterns.prototype.library;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Glowna");
        Book book1 = new Book("Cieciorka", "Walesa", LocalDate.of(2017,2,3));
        Book book2 = new Book("Cieciorka2", "Walesa1", LocalDate.of(2012,3,23));
        Book book3 = new Book("Cieciorka3", "Walesa2", LocalDate.of(2018,6,13));
        Book book4 = new Book("Cieciorka4", "Walesa3", LocalDate.of(2020,7,22));
        Book book5 = new Book("Cieciorka5", "Walesa4", LocalDate.of(2011,1,12));
        Book book6 = new Book("Cieciorka6", "6", LocalDate.of(2006,1,12));
        Book book7 = new Book("Tylko shllow?", "11111", LocalDate.of(2006,1,12));
        //When
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);


        Library clonedLibrary= null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepClonedLibrary.books.add(book6);
        clonedLibrary.books.add(book7);


        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks() + "\n");
        System.out.println(clonedLibrary.getName());

        System.out.println(clonedLibrary.getBooks() + "\n");

        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks() + "\n");
        assertEquals(6, deepClonedLibrary.books.size());
        assertNotEquals(5, library.books.size());
        assertEquals(6, clonedLibrary.books.size());




    }
}
