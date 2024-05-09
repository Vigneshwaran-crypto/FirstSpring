package com.example.firsttest.firsttest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firsttest.firsttest.Modals.BookModal;

@Repository
public interface BookRepository extends JpaRepository<BookModal,Long> {

    
} 
