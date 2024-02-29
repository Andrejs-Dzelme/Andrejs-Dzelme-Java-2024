package Model;

public class Professor {
	private long pID;
	private String name;
	private String surname;
	private Degree degree;
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
	public Degree getDegree(){
		return degree;
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
	public void setDegree(Degree degree) {
		if(degree != null)
			this.degree = degree;
		else
			this.degree = Degree.other;
	}

	//3. Constructors
	public Professor() {
		setpID();
		setName("Normunds");
		setSurname("Cietumnieks");
		setDegree(Degree.doctor);
	}	
	public Professor(String name, String surname, Degree degree) {
		setpID();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	//4. toString
	public String toString() {
		return pID + ": " + degree + ", " + name + " " + surname;
	}
	
	
}
