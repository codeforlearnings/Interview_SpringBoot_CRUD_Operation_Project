package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="p_tab")
public class Person {
@Id
@Column(name="p_id")
private	Integer id;

private String firstName;

@Column(name="l_name")
private String lastName;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}



}
