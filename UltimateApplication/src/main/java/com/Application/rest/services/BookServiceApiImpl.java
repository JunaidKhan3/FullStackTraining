package com.Application.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Application.rest.EmployeeEntity.Book;
import com.Application.rest.Repo.BookApiRepo;


@Service
@Transactional
public class BookServiceApiImpl implements BookApiService {

	@Autowired
	private BookApiRepo bookapirepo;
	

	@Override
	public void savebook(Book book) {
		 bookapirepo.save(book);
	}
	@Override
	public List<Book> getBookList() {
		return bookapirepo.findAll();
	}
	

	@Override
	public Book findByBookId(int bookId) {
		return bookapirepo.findByBookId(bookId);
	}
	
	
}
