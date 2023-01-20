package com.masai.present;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;

@RestController
public class PresentationL {

	private ArrayList<Book> bookslist;
	
	@GetMapping("/books")
	public ArrayList<Book> getAllBooks() {
		
		return bookslist;
	}
	
	@GetMapping("/book/{id}")
	public Book getAnyBook(@PathVariable("id") Integer Book_Id) {
		Book book = bookslist.stream().filter(a -> a.getBook_Id() == Book_Id).collect(Collectors.toList()).get(0);
		return book;
	}
	
	@PostMapping(value = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Book> createNewBook(@RequestBody Book book) {
		bookslist.add(book);
		return bookslist;
	}
	
	@DeleteMapping("/book/{id}")
	public ArrayList<Book> deleteBook(@PathVariable("id") Integer Book_Id){
		Book book = bookslist.stream().filter(a -> a.getBook_Id() == Book_Id).collect(Collectors.toList()).get(0);
		bookslist.remove(book);
		return bookslist;
	}
}
