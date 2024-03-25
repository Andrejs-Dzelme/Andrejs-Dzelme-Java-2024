package Model;

public abstract class AbstractCustomerAsPerson extends AbstractCustomer{
	//1. Variables
	private Address address;
	private String phone;
	private String  customerCode;
	private Person name, surname, personal_number;
	protected Person person;
	//private AbstractCustomer cID;

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
	public AbstractCustomerAsPerson() {
		//super();
		setAddress(new Address());
		setPhone(phone.toString());
	}	
	public AbstractCustomerAsPerson(Person name, Person surname, Person personal_number, Address address, String phone) {
		//super(name, surname, personal_number);
		setAddress(address);
		setPhone(phone);
	}
	
	//4. toString
	public String toString() {
		return name+" "+surname+", P/K: "+personal_number+"\nAddress nr."+address+"; Phone: "+phone;
	}
	
}
