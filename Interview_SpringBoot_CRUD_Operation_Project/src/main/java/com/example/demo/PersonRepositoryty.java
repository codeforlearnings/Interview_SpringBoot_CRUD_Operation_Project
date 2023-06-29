package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepositoryty extends CrudRepository<Person, Integer>{
	
public	Person findByFirstName(String firstName);
public	Person findByLastName(String firstName);
public	Person findByFirstNameAndLastName(String firstName, String lastName);
public	List<Person> findAllByFirstName(String firstName);
public	List<Person> findAllByFirstNameOrLastName(String firstName,String lastName);
public	List<Person> findAllByFirstNameLike(String firstName);
	

}
