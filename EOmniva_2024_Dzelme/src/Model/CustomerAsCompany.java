package Model;

public class CustomerAsCompany{
	//1. Variables
	private Address address;
	private String phone;
	private String  customerCode;
	private String title;
	private String companyRegNo;
	private AbstractCustomer cID;

	//2. gets and sets
	public Address getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getTitle() {
		return title;
	}
	public String getCompanyRegNo() {
		return companyRegNo;
	}
	//________________________________________________________
	public void setAddress(Address address) {
		if(address != null) {
			this.address = address;
		}
		else
			this.address = new Address();
	}
	public void setPhone(String phone) {
		if(phone != null && phone.matches("[+0-9]{3}[ 0-9]+")) {
			this.phone = phone;
		}
		else
			this.phone = "+371 00000000";
		this.phone = phone;
	}
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
	public CustomerAsCompany() {//___________________________Is that correct?		
		setAddress(new Address());
		setPhone(phone.toString());
		setTitle(title.toString());
		setCompanyRegNo(companyRegNo.toString());
	}	
	public CustomerAsCompany(Address address, String phone, String title, String companyRegNo) {		
		setAddress(address);
		setPhone(phone);
		setTitle(title);
		setCompanyRegNo(companyRegNo);
	}
	
	//4. toString
	public String toString() {
		return title+", Reg. nr.: "+companyRegNo+", Phone: "+phone;
	}
	
	public void setCustomerCode() {
		this.customerCode = cID+"_Company_"+customerCode;
	}

	/*
	 Pārrakstīt setCustomerCode funkciju, lai customerCode uzstādīšana notiktu pēc sekojošas shēmas:
		<pircēja ID>_person_<personCode> . Piemēram, cilvēkam ar personas kodu 121212-12345 customerCode vajadzētu
		uzstādīt uz “2_person_121212-12345” (1 punkts);
	 */
}
