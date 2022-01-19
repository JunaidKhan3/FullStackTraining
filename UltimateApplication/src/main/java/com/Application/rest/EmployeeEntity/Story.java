package com.Application.rest.EmployeeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="story")
public class Story {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)


private int storyId;

@Column(name="story_name")
private String storyName;
@ManyToOne
@JoinColumn(name = "book_id",referencedColumnName = "bookId")
@JsonIgnoreProperties("stories")

//@Column(name = "book_id")
//private int bookId;
private Book book;

public int getStoryId() {
    return storyId;
}
public void setStoryId(int storyId) {
    this.storyId = storyId;
}
public String getStoryName() {
    return storyName;
}
public void setStoryName(String storyname) {
    this.storyName = storyname;
}
public Book getBook() {
    return book;
}
public void setBook(Book book) {
    this.book = book;
}
}


//public Story(String storyname) {	
//	this.storyname = storyname;
//}
//
//public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}
//
//public String getStoryname() {
//	return storyname;
//}
//
//public void setStoryname(String storyname) {
//	this.storyname = storyname;
//}
//
//@Override
//public String toString() {
//	return "Story [id=" + id + ", storyname=" + storyname + "]";
//}
