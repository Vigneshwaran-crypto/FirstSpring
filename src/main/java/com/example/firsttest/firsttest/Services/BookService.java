package com.example.firsttest.firsttest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.firsttest.firsttest.Modals.BookModal;
import com.example.firsttest.firsttest.Repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookModal> getAllBooks(){
        return bookRepository.findAll();
    }

    public BookModal getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public BookModal createBookModal(BookModal book){
            return bookRepository.save(book);
    }

    public BookModal updateBookModal(Long id,BookModal book){
        BookModal existingBook = bookRepository.findById(id).orElse(null);

        if(existingBook != null){
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setYearPublished(book.getYearPublished());
            return bookRepository.save(existingBook);

        }else{
            return null;
        }

    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }



    
}
