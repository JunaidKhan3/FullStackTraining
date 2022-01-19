package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
private int answer_Id;
	
private String answer;

private Question question;

public int getAnswer_Id() {
	return answer_Id;
}

public void setAnswer_Id(int answer_Id) {
	this.answer_Id = answer_Id;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}

public Answer() {

}

public Answer(int answer_Id, String answer, Question question) {
	this.answer_Id = answer_Id;
	this.answer = answer;
	this.question = question;
}


}

