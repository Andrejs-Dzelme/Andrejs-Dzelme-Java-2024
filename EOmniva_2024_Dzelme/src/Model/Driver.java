//Driver (6 punkti) manto klasi Person, bet ar papildus mainīgajiem - dID, licenseNo un experienceInYears. Nodrošināt dID
//uzstādīšanu pēc “autoincrement” algoritma.

package Model;

public class Driver extends Person{
	//1. variables
	private long dID;
	private String licenseNo;
	private float experienceInYears;
	private static long counter = 0;
	
	//2. get and set
	public long getdID() {
		return dID;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public float getExperienceInYears() {
		return experienceInYears;
	}

	//__________________________________________
	public void setdID() {
		dID = counter;
		counter++;
	}
	public void setLicenseNo(String licenseNo) {
		if(licenseNo != null && licenseNo.matches("[A-Z]{2}[0-9]{6}")) {
			this.licenseNo = licenseNo;
		}
		else
			this.licenseNo = "Undefined";
	}
	public void setExperienceInYears(float experienceInYears) {
		if(experienceInYears >= 3 && experienceInYears <= 40) {
			this.experienceInYears = experienceInYears;
		}
		else
			this.experienceInYears = 3;
	}

	//3. Constructors
	public Driver() {
		super();
		setdID();
		setLicenseNo("AT896727");
		setExperienceInYears(3); 		
	}	

	public Driver(String name, String surname, String personal_number, String licenseNo, float experienceInYears) {
		super(name, surname, personal_number);
		setdID();
		setLicenseNo(licenseNo);
		setExperienceInYears(experienceInYears); 		
	}	
	
	//4. toString
	public String toString() {
		return super.getName()+" "+super.getSurname()+", P/K: "+super.getPersonal_number()+"\nLicense nr."+licenseNo+"; experience: "+experienceInYears+" years";
	}
	
	
	
	
}
