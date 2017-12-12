package com.javawebtutor;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	private int id;

	private String name;

	@OneToOne
	@JoinColumn(name = "cellular_id")
	private Cellular cellular;

	@ManyToMany
	@JoinTable(name = "person_dog", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "dog_id"))
	private List<Dog> dogs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cellular getCellular() {
		return cellular;
	}

	public void setCellular(Cellular cellular) {
		this.cellular = cellular;
	}
}