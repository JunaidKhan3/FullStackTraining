package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory =cfg.buildSessionFactory();
	
         //creating a question
         Question q1=new Question();
         q1.setQuestionId(111);
         q1.setQuestion("what is java");
         
         //creating a answer
         Answer ans1=new Answer();
         ans1.setAnswer_Id(343);
         ans1.setAnswer("Java is programming language");
         
         Question q2=new Question();
         q2.setQuestionId(112);
         q2.setQuestion("what is collection framework");
         
         Answer ans2=new Answer();
         ans2.setAnswer_Id(434);
         ans2.setAnswer("it is an api to work in a object");
         

	//creating seasson
	Session s=factory.openSession();
	Transaction tr=s.beginTransaction();
	
	//save
	s.save(q1);
	s.save(q2);

	tr.commit();
	s.close();
	
factory.close(); 
}
}
