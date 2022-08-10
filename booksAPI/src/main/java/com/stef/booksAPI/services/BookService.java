package com.stef.booksAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stef.booksAPI.models.Book;
import com.stef.booksAPI.repositories.BookRepository;

@Service
public class BookService {
	 
	private final BookRepository repo;
	 
	 public BookService(BookRepository repo) {
	     this.repo = repo;
	 }
	 // returns all the books
	 public List<Book> allBooks() {
	     return repo.findAll();
	 }
	 // creates a book
	 public Book createBook(Book book) {
	     return repo.save(book);
	 }
	 // retrieves a book
	 public Book findBook(Long id) {
		 Optional<Book> book = repo.findById(id);
			if (book.isPresent()) {
				return book.get();
			}
			else {
				return null;
			}
		}
		
		public Book updateBook(Book book) {
			
			return repo.save(book);
		}
		
		public void deleteBook(Long id) {
			repo.deleteById(id);
		}
		
}