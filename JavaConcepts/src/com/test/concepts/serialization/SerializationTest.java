package com.test.concepts.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Date;

class SportPerson {

	String name;

	public SportPerson(String name) {
		super();
		this.name = name;
	}

	public SportPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Cricketer extends SportPerson implements Serializable {

	/**
	 * 
	 */
	int highestScore;
	int numberOfMatches;
	transient Date dateOfBirth;

	public int getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Cricketer(String name, int highestScore, int numberOfMatches, Date dateOfBirth) {
		super(name);
		this.highestScore = highestScore;
		this.numberOfMatches = numberOfMatches;
		this.dateOfBirth = dateOfBirth;
	}

	public Cricketer() {
		super();
	}

	@Override
	public String toString() {
		return "[ name = " + this.getName() + " highestScore =" + this.getHighestScore() + " numberOfMatches = "
				+ this.getNumberOfMatches() + " dateOfBirth = " + this.getDateOfBirth() + "]";
	}

	private Object readResolve() throws ObjectStreamException {

		System.out.println(" i am in readResolve !!!!!");
		return this;
	}

	private Object writeReplace() throws ObjectStreamException {
		System.out.println(" i am in writeReplace !!!!!");
		return this;
	}
}

public class SerializationTest {

	Cricketer viratKohli;
	File file = new File("vkProfile");

	public static void main(String[] args) {

		SerializationTest st = new SerializationTest();
		st.init();
		st.writeObject();
		st.readObject();

	}

	private void init() {
		viratKohli = new Cricketer("Virat Kohli", 200, 100, new Date(1987, 06, 15));
	}

	private void writeObject() {

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(viratKohli);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void readObject() {

		Cricketer vk = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			vk = (Cricketer) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(vk);
	}

}
