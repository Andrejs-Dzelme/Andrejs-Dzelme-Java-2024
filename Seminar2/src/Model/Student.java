package Model;

public class Student {
	//1. variables
	private long sID;
	private String name;
	private String surname;
	private String personal_number;
	private static long counter = 10000;
	
	//2. get and set
	public long getsID() {
		return sID;
	}
	public String getName(){
		return name;
	}
	public String getSurame(){
		return surname;
	}	
	public void setsID() {
		sID = counter;
		counter++;
	}	
	public String getPersonal_number() {
		return personal_number;
	}
	
	public void setPersonal_number(String personal_number) {
		if(personal_number != null && personal_number.matches("[0-9]{6}-[0-9]{5}")) {
			this.personal_number = personal_number;
		}
		else
			this.personal_number = "Incorrect";
	}
	public void setName(String name) {
		if(name != null && name.matches("[A-ZĒŪĪĻĶĢĀŽŠŅ]{1}[a-zēūīļķāžšņ]+")) {
			this.name = name;
		}
		else
			this.name = "Undefined";
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-ZĒŪĪĻĶĢĀŽŠŅ]{1}[a-zēūīļķāžšņ]+")) {
			this.surname = surname;
		}
		else
			this.surname = surname;
	}
	
	//3. constructors
	public Student() {
		setsID();
		setName("Eksistētājs");
		setSurname("Mūžīgais");
		setPersonal_number("030487-12430");
	}	
	
	public Student(String name, String surname, String personal_number) {
		setsID();
		setName(name);
		setSurname(surname);
		setPersonal_number(personal_number);
	}
	
	//4. toString
	public String toString() {
		return sID + ": " + name + " " + surname + " " + personal_number;
	}	

	
}
