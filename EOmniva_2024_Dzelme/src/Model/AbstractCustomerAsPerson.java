package Model;

public abstract class AbstractCustomerAsPerson extends AbstractCustomer{
	//1. Variables
	private Address address;
	private String phone;
	private String  customerCode;
	protected Person person;

	//2. gets and sets
	public Address getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	
	//3. Constructors
	public AbstractCustomerAsPerson() {
		super();
		person = new Person();
	}	
	public AbstractCustomerAsPerson(String name, String surname, String personal_number, Address address, String phoneNo) {
		super(address, phoneNo);
		person = new Person(name, surname, personal_number);
	}
	
	//4. toString
	public String toString() {
		return super.getName()+" "+super.getSurname()+", P/K: "+super.getPersonal_number()+"\nAddress nr."+super.getAddress()+"; Phone: "+super.getPhoneNo();
	}
	
}
