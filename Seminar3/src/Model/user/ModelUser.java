package Model.user;

public class ModelUser {
	//1.variable
	private long userID;
	private static long counter = 0;
	
	//2.get and set
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = counter++;;
	}
	
	//Constructors
	public ModelUser() {
		setUserID(userID);
	}
	
	//toString
	public String toString(){
		return " " + userID;
	}
	
}
