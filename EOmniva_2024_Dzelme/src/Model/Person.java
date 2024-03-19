//Person (1 punkts) - paredzēta personas datu nodrošināšanai - name, surname, personCode.

package Model;

public class Person {
	//1. variables
	private String name;
	private String surname;
	private String personal_number;
	
	//2. gets and sets	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonal_number() {
		return personal_number;
	}
	
	public void setName(String name) {
		if(name != null && name.matches("[A-ZĒŪĪĻĶĢĀŽČŠŅ]{1}[a-zēūīļķāžčšņ]+")) {
			this.name = name;
		}
		else
			this.name = "Undefined";
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-ZĒŪĪĻĶĢĀŽČŠŅ]{1}[a-zēūīļķāžčšņ]+")) {
			this.surname = surname;
		}
		else
			this.surname = "Undefined";
	}
	public void setPersonal_number(String personal_number) {
		if(personal_number != null && personal_number.matches("[0-9]{6}-[0-9]{5}")) {
			this.personal_number = personal_number;
		}
		else
			this.personal_number = "Incorrect";
	}
	
	//3. Constructors
	public Person() {
		setName("Vārds");
		setSurname("Uzvārds");
		setPersonal_number("000000-00000");
	}
	
	public Person(String name, String surname, String personal_number) {
		setName(name);
		setSurname(surname);
		setPersonal_number(personal_number);
	}
	
	//4. toString
	public String toString() {
		return name + " " + surname + ": " + personal_number;
	}
	

}
