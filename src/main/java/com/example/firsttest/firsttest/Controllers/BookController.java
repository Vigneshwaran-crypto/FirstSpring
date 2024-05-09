package com.example.firsttest.firsttest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firsttest.firsttest.Modals.BookModal;
import com.example.firsttest.firsttest.Services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    public BookService bookService;

    @GetMapping("/getAllBooks")
    public List<BookModal> getAllBooks(){
        return bookService.getAllBooks();
    }


    @GetMapping("/{id}")
    public BookModal getBookById (@PathVariable Long id){
        return bookService.getBookById(id);
    }


    @PostMapping("/createBook")
    public BookModal createBook(@PathVariable BookModal bookModal){
        return bookService.createBookModal(bookModal);
    }

    @PostMapping("/updateBook/{id}")
    public BookModal updateBook(@PathVariable Long id,@RequestBody BookModal bookModal){
        return bookService.updateBookModal(id, bookModal);
    }

    @PostMapping("deleteBook/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
    
}


