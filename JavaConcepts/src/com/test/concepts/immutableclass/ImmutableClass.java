package com.test.concepts.immutableclass;

import java.time.LocalDate;

public class ImmutableClass {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2014, 05, 01);
		System.out.println(dob);
		ImmutableClass ic = new ImmutableClass("Pranjal", dob);
		System.out.println(ic.getName());
		System.out.println(ic.getDateOfBirth());
		dob.minusMonths(13);
		System.out.println(dob);
		System.out.println(ic.getDateOfBirth());
		
		Mutable m = new Mutable("Juee", dob);
		ImmutableClass ic1 = (ImmutableClass)m;
	}

	private String name;
	private LocalDate dateOfBirth;

	public ImmutableClass(String name, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

}

class Mutable extends ImmutableClass {

	public Mutable(String name, LocalDate dateOfBirth) {
		super(name, dateOfBirth);
	}
	
}