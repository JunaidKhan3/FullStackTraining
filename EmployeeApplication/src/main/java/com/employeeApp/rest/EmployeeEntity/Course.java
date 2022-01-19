package com.employeeApp.rest.EmployeeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="course")
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="title")
private String title;
//@ManyToOne(targetEntity = Instructor.class)
@Column(name="instructor_id")
private int instructorId;

public Course() {
	
}
public Course(String title) {
	this.title = title;
}

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


public int getInstructorId() {
	return instructorId;
}


public void setInstructorId(int instructorId) {
	this.instructorId = instructorId;
}


@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + "]";
}
}
