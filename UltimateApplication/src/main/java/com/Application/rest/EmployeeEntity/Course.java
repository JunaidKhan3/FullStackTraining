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
@Table (name="course")
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(name="id")
private int id;
@Column(name="title")
private String title;
@ManyToOne
@JoinColumn(name="instructor_id",referencedColumnName = "id")
@JsonIgnoreProperties("courses")

//@Column(name="instructor_id")
//private int instructorId;
private Instructor instructor;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Instructor getInstructor() {
	return instructor;
}
public void setInstructor(Instructor instructor) {
	this.instructor = instructor;
}



//public Course() {
//	
//}
//public Course(String title) {
//	this.title = title;
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
//
//public String getTitle() {
//	return title;
//}
//
//
//public void setTitle(String title) {
//	this.title = title;
//}
//
//
//public Instructor getInstructorId() {
//	return instructor;
//}
//
//
//public void setInstructorId(Instructor instructor) {
//	this.instructor = instructor;
//}


//@Override
//public String toString() {
//	return "Course [id=" + id + ", title=" + title + "]";
//}
}
