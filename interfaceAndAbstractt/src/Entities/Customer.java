package Entities;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String identityNumber;
	public Customer() {
		super();
	}
	public Customer(int id, String firstName, String lastName, int yearOfBirth, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = yearOfBirth;
		this.identityNumber = identityNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int yearOfBirth) {
		this.dateOfBirth = yearOfBirth;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
}
