package Model;

public class Student {
	//1. variables
	private long pID;
	private String name;
	private String surname;
	private static long counter = 0;
	
	//2. get and set
	public long getpID() {
		return pID;
	}
	public String getName(){
		return name;
	}
	public String getSurame(){
		return surname;
	}
	
	public void setpID() {
		pID = counter;
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
		setpID();
		setName("Eksistētājs");
		setSurname("Mūžīgais");
	}	
	
	public Student(String name, String surname, Degree degree) {
		setpID();
		setName(name);
		setSurname(surname);
	}
	
	//4. toString
	public String toString() {
		return pID + ": " + name + " " + surname;
	}
	
	
	
	
	
	
}
