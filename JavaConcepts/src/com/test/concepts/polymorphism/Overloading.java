package com.test.concepts.polymorphism;

/*
 * In Overloading, method signature can NOT be same and are also overloaded in same class only
 * No restrictions for visibility and exception as well.
 */
public class Overloading {

	public static void main(String[] args) {

		try {
			new Furniture().doFurniture();
			new Furniture().doFurniture("Wooden Sofa", Boolean.TRUE, 2);
			new Furniture().doFurniture("Wooden Sofa", 2);
			new Furniture().doFurniture(2, "Wooden Sofa");

			Furniture f1 = new Furniture("Wooden");
			Furniture f2 = new Furniture("Cusion", Boolean.TRUE);
			Furniture f3 = new Furniture("Simple", 2);
			Furniture f4 = new Furniture("Spanish", Boolean.TRUE, 5);
		} catch (Exception e) {
		}

	}

}

class Furniture {

	String sofa;
	boolean tvUnit;
	int wardrob;

	/**
	 * 
	 */
	public Furniture() {
		super();
	}

	public String doFurniture(int numberOfWardrobs, String sofa) throws MyException {
		System.out.println(" Furnitue done " + sofa + "----" + numberOfWardrobs);
		return sofa;
	}

	public void doFurniture(String sofa, int numberOfWardrobs) throws Exception {
		System.out.println(" Furnitue done " + sofa + "----" + numberOfWardrobs);
	}

	public void doFurniture(String sofa, Boolean tvUnit, int numberOfWardrobs) throws RuntimeException {

		System.out.println(" Furnitue done " + sofa + "---" + tvUnit + "----" + numberOfWardrobs);
	}

	/**
	 * @param sofa
	 */
	public Furniture(String sofa) {
		super();
		this.sofa = sofa;
	}

	/**
	 * @param sofa
	 * @param tvUnit
	 */
	public Furniture(String sofa, boolean tvUnit) {
		super();
		this.sofa = sofa;
		this.tvUnit = tvUnit;
	}

	/**
	 * @param sofa
	 * @param tvUnit
	 * @param wardrob
	 */
	public Furniture(String sofa, boolean tvUnit, int wardrob) {
		this(sofa, wardrob);
		this.tvUnit = tvUnit;

	}

	/**
	 * @param sofa
	 * @param wardrob
	 */
	public Furniture(String sofa, int wardrob) {
		super();
		this.sofa = sofa;
		this.wardrob = wardrob;
	}

	public void doFurniture() throws Exception {

		System.out.println(" method without fields !!! ");
	}

}

class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7666797909090609119L;
	String cause;

	/**
	 * @param cause
	 */
	public MyException(String cause) {
		super();
		this.cause = cause;
	}

}