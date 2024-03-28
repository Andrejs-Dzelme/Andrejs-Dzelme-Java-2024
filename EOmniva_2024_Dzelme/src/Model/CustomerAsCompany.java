package Model;

public class CustomerAsCompany extends AbstractCustomer{
	//1. Variables
	private String  customerCode;
	private String title;
	private String companyRegNo;

	//2. gets and sets
	public String getTitle() {
		return title;
	}
	public String getCompanyRegNo() {
		return companyRegNo;
	}	
	public String getCustomerCode() {
		return customerCode;
	}
	//________________________________________________________
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
		setTitle("Nosaukums");
		setCompanyRegNo("00000000");
	}	
	public CustomerAsCompany(Address address, String phoneNo, String title, String companyRegNo) {		
		super(address, phoneNo);
		setTitle(title);
		setCompanyRegNo(companyRegNo);
	}
	
	//4. toString
	public String toString() {
		return "\""+title+"\", Reg. nr.: "+companyRegNo+"\nAddress: "+super.getAddress()+", Phone: "+super.getPhoneNo()+"\n";
	}
	
	//5. other functions
	public void setCustomerCode() {
		this.customerCode = super.getcID()+"_Company_"+companyRegNo;
	}

}
