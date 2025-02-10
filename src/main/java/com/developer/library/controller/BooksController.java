package com.developer.library.controller;

import com.developer.library.model.Books;
import com.developer.library.service.BooksService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RestController
public class BooksController {

    @Autowired
    BooksService booksService;
    @GetMapping("/book/{bookId}")
    private List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @DeleteMapping("/books/{booksId}")
    private void deleteBook(@PathVariable("booksId") int booksId) {
        booksService.deleteBook(booksId);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
       booksService.saveOrUpdateBooks(books);
       return books.getBookId();
    }

    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
         booksService.saveOrUpdateBooks(books);
         return books;
    }
}
