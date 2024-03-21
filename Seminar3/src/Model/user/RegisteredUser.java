package Model.user;

import java.security.MessageDigest;

import Service.IPostService;

public abstract class RegisteredUser extends GuestUser implements IPostService{
	
	//1.variables
	private String username;
	protected String nameAndSurnameOrTitle;
	//TODO izmantot enkodešanu
	private String password;
	
	//2.get and set
	public String getUsername() {
		return username;
	}
	//TODO aizstat atstarpi ar apakšsvītru
	public void setUsername() {
			this.username = super.getUserID() + "_" 
	+ nameAndSurnameOrTitle.substring(0, 5).trim();
	}
	public String getNameAndSurnameOrTitle() {
		return nameAndSurnameOrTitle;
	}
	public abstract void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle);	
	
	
	//TODO apdomāt, varbūt nomainīt pieejamības atribūtu
	public String getPassword() {
		return password;
	}
	public void setPassword(String inputPassword) {
		if (inputPassword != null && inputPassword.matches("[A-Z0-9]")) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputPassword.getBytes());
				this.password = new String(md.digest());				
			}
			catch (Exception e) {
				this.password = "ABC123";
			}
		}
		
	}
	
	public RegisteredUser() {
		super();//tiks izsaukts GuestUser() konstruktors
		setPassword("1234567");
	}
	
	
	//3.constructors
	public RegisteredUser(String password) {
		super();//tiks izsaukts GuestUser() konstruktors
		setPassword(password);
	}
	
	//4.toString
	public String toString() {
		return "Registered User -> " +super.toString() + ": " 
	+ nameAndSurnameOrTitle + " (" + username + ")";
	}
	
	
	

	
	//5. other functions
	//TODO login and followPage
	

}