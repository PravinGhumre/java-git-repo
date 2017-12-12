package com.javawebtutor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 08 Entity implementation class for Entity: Department 09
 * 
 * 10
 */
@Entity
@Table(name = "Department")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int did;

	private String dname;

	@OneToMany(mappedBy = "department", fetch=FetchType.EAGER)
	private List<Employee> employees = new ArrayList<Employee>();

	public Department() {
		super();
	}

	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;

	}

	public String getDname() {
		return dname;

	}

	public void setDname(String dname) {
		this.dname = dname;

	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployee(List<Employee> employees) {
		this.employees = employees;
	}

}