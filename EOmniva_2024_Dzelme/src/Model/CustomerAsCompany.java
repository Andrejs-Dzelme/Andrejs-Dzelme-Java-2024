package Model;

public class CustomerAsCompany extends AbstractCustomer{
	//1. Variables
	private String  customerCode;
	private String title;
	private String companyRegNo;
	//private AbstractCustomer cID;

	//2. gets and sets
	public String getTitle() {
		return title;
	}
	public String getCompanyRegNo() {
		return companyRegNo;
	}
	//________________________________________________________
	public String getCustomerCode() {
		return customerCode;
	}
	public void setTitle(String title) {
		if(title != null) {
			this.title = title;
		}
		else
			this.title = "Undefined";
	}
	public void setCompanyRegNo(String companyRegNo) {
		if(companyRegNo != null && companyRegNo.matches("[0-9]{8}")) {
			this.companyRegNo = companyRegNo;
		}
		else
			this.companyRegNo = "Incorrect";
	}
	//3. Constructors
	public CustomerAsCompany() {	
		super();
		setTitle(title.toString());//paliek
		setCompanyRegNo(companyRegNo.toString());//paliek
	}	
	public CustomerAsCompany(Address address, String phoneNo, String title, String companyRegNo) {		
		super(address, phoneNo);
		setTitle(title);
		setCompanyRegNo(companyRegNo);
	}
	
	//4. toString
	public String toString() {
		return title+", Reg. nr.: "+companyRegNo+", Phone: "+super.getPhoneNo();
	}
	
	//5. other functions
	public void setCustomerCode() {
		this.customerCode = super.getcID()+"_Company_"+customerCode;
	}

}
