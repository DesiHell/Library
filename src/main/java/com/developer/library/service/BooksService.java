package com.developer.library.service;

import com.developer.library.model.Books;
import com.developer.library.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService implements BooksInterface{

    @Autowired
    BooksRepository booksRepository;
    @Override
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    @Override
    public Books getBookById(int id) {
        return booksRepository.findById(id).get();
    }

    @Override
    public void deleteBook(int id) {
    booksRepository.deleteById(id);
    }

    @Override
    public void saveOrUpdateBooks(Books books) {
        booksRepository.save(books);
    }
}
