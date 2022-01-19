package com.Application.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Application.rest.EmployeeEntity.Book;
import com.Application.rest.EmployeeEntity.Employee;
import com.Application.rest.services.BookApiService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookApiService bookapiservice;
	
	@PostMapping("savebook")
	public String savebookapi(@RequestBody Book book) {
		System.out.println(book.toString());
		bookapiservice.savebook(book);
		return "Book Added successfull";
	}
	@ResponseBody
	@GetMapping("/{bookId}")
	public Book getBookDetails(@PathVariable int bookId) {
		return bookapiservice.findByBookId(bookId);
	}
	
	@GetMapping("getbookListData")//showing Data
	public List<Book> getBookRealList() {
		List<Book> lstbook=bookapiservice.getBookList();
		return lstbook;	
	}
}
                                                      