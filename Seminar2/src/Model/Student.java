package Model;

public class Student {
	//1. variables
	private long sID;
	private String name;
	private String surname;
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
	}	
	
	public Student(String name, String surname) {
		setsID();
		setName(name);
		setSurname(surname);
	}
	
	//4. toString
	public String toString() {
		return sID + ": " + name + " " + surname;
	}	
	
}
