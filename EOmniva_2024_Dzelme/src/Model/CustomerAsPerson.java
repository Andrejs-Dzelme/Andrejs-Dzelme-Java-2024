package Model;

public class CustomerAsPerson extends Person{
	//1. Variables
	private Address address;
	private String phone;
	private String  customerCode;
	private AbstractCustomer cID;

	//2. gets and sets
	public Address getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}

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
	
	//3. Constructors
	public CustomerAsPerson() {
		super();
		setAddress(new Address());
		setPhone(phone.toString());
	}	
	public CustomerAsPerson(String name, String surname, String personal_number, Address address, String phone) {
		super(name, surname, personal_number);
		setAddress(address);
		setPhone(phone);
	}
	
	//4. toString
	public String toString() {
		return super.getName()+" "+super.getSurname()+", P/K: "+super.getPersonal_number()+"\nAddress nr."+address+"; Phone: "+phone;
	}
	
	public void setCustomerCode() {
		this.customerCode = cID+"_Person_"+super.getPersonal_number();
	}

	/*
	 Pārrakstīt setCustomerCode funkciju, lai customerCode uzstādīšana notiktu pēc sekojošas shēmas:
		<pircēja ID>_person_<personCode> . Piemēram, cilvēkam ar personas kodu 121212-12345 customerCode vajadzētu
		uzstādīt uz “2_person_121212-12345” (1 punkts);
	 */
}
