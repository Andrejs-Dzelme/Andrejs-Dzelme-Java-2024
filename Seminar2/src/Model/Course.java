package Model;

public class Course {
	//1. variables
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	private static long counter = 100;
	
	//2. get and set
	public long getcID() {
		return cID;
	}
	public String getTitle(){
		return title;
	}
	public int getCreditPoints(){
		return creditPoints;
	}	
	public Professor getProfessor() {
		return professor;
	}
	
	
	public void setcID() {
		cID = counter;
		counter++;
	}
	public void setTitle(String title) {
		if(title != null && title.matches("[A-Za-z 0-9]+")) {
			this.title = title;
		}
		else
			this.title = "Undefined";
	}
	public void setCreditPoints(int creditPoints) {
		if(creditPoints > 0 && creditPoints <= 20) {
			this.creditPoints = creditPoints;
		}
		else
			this.creditPoints = 2;
	}			
	public void setProfessor(Professor professor) {
		if(professor != null) {
			this.professor = professor;
		}
		else
			this.professor = new Professor();
	}
	
	//3. constructors
	public Course() {
		setcID();
		setTitle("Elektroiekārtu elektrobarošana");
		setCreditPoints(2);
		setProfessor(new Professor()); //Noklusējuma profesors
	}	 
	
	public Course(String title, int creditPoints, Professor professor) {
		setcID();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessor(professor);
	}
	
	//4. toString
	public String toString() {
		return cID + ": " + title + ", " + creditPoints + ", pasniedz: " + professor;
	}
	
}
