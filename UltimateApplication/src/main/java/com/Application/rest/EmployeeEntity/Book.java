package com.Application.rest.EmployeeEntity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bookId;

@Column(name="book_name")
private String bookname;

@OneToMany(cascade=CascadeType.ALL,orphanRemoval = true,targetEntity = Story.class )
@JoinColumn(name="book_id")
private List<Story>stories;

public int getBookId() {
    return bookId;
}
public void setBookId(int bookId) {
    this.bookId = bookId;
}


public String getBookname() {
	return bookname;
}

public void setBookname(String bookname) {
	this.bookname = bookname;
}

public List<Story> getStories() {
	return stories;
}

public void setStories(List<Story> stories) {
	this.stories = stories;
}



}
