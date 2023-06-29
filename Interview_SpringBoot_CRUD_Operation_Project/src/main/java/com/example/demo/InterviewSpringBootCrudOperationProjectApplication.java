package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewSpringBootCrudOperationProjectApplication implements CommandLineRunner {

	@Autowired
	private PersonRepositoryty personRepositoryty;
	
	public static void main(String[] args) {
		SpringApplication.run(InterviewSpringBootCrudOperationProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.setId(501);
		p1.setFirstName("Ayan1");
		p1.setLastName("Richared1");
		
		personRepositoryty.save(p1);
		
		Person p2=new Person();
		p2.setId(601);
		p2.setFirstName("Ayan2");
		p2.setLastName("Richared2");
		
		personRepositoryty.save(p2);
		
		Person p3=new Person();
		p3.setId(701);
		p3.setFirstName("Ayan3");
		p3.setLastName("Richared3");
		
		personRepositoryty.save(p3);
		
		Person p4=new Person();
		p4.setId(801);
		p4.setFirstName("Ayan4");
		p4.setLastName("Richared4");
		
		personRepositoryty.saveAll(Arrays.asList(p3,p4));
		
		Person p=personRepositoryty.findById(501).get();
		
		System.out.println(p.getId() +"-"+p.getFirstName()+"-"+p.getLastName());
		
		List<Person> persons = (List<Person>) personRepositoryty.findAll();
		
		for(Person person:persons){
			System.out.println(person.getId() +"-"+person.getFirstName()+"-"+person.getLastName());
		
			
	//	personRepositoryty.deleteAll(Arrays.asList(p2,p3));	
	//	personRepositoryty.deleteById(501);
		
		Person person1=personRepositoryty.findByFirstName("Ayan1");
		List<Person> person2=personRepositoryty.findAllByFirstName("Aryan3");
		List<Person> person3=personRepositoryty.findAllByFirstNameLike("%A%");
		List<Person> person4=(List<Person>) personRepositoryty.findAllByFirstNameOrLastName("Aryan3","Richared3");
		
	System.out.println(person1.getId()+"-"+ person1.getFirstName()+"-"+person1.getLastName());
		
		for(Person  pr2:person2) {
		System.out.println(pr2.getId()+"--"+ pr2.getFirstName()+"--"+pr2.getLastName());
		}
		
		for(Person  pr3:person3) {
		System.out.println(pr3.getId()+"---"+ pr3.getFirstName()+"---"+pr3.getLastName());
		}
		
		for(Person pr4:person4) { System.out.println(pr4.getId()+"----"+
		 pr4.getFirstName()+"----"+pr4.getLastName()); }
	
	}}}
