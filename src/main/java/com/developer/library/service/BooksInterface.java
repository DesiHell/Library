package com.developer.library.service;

import com.developer.library.model.Books;

import java.util.List;

public interface BooksInterface {
    List<Books> getAllBooks();
    Books getBookById(int id);
    void deleteBook(int id);
    void saveOrUpdateBooks(Books books);
}
