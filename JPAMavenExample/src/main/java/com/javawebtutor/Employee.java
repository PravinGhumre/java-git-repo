package com.javawebtutor;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 08 Entity implementation class for Entity: Employee 09
 * 
 * 10
 */

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	private String ename;

	private double salary;

	private int job_id;

	@ManyToOne
	@JoinColumn(name = "did")
	private Department department;

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;

	}

	public Employee(int eid, String ename, double salary, int job_id,
			Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.job_id = job_id;
		this.department = department;
	}

	public Employee(int eid, String ename, double salary, int job_id) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.job_id = job_id;
	}
}
