package pl.mkrause.javaee.domain;

public class Guest {

	private String name;
	private String surname;
	
	public Guest() {
		super();
	}
	
	
	public Guest(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname() {
		this.surname = surname;
	}
}

