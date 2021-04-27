package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> booksB = new HashMap<>();
        for(com.kodilla.patterns2.adapter.bookclassifier.librarya.Book tempBooks: bookSet) {
            booksB.put(new BookSignature(tempBooks.getSignature()), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(tempBooks.getAuthor(),
                    tempBooks.getTitle(), tempBooks.getPublicationYear()));
        }
        return medianPublicationYear(booksB);
    }
}
