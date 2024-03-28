package Model;

public abstract class AbstractCustomerAsPerson extends AbstractCustomer{
	//1. Variables
	protected Person person;
	
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
		return person.getName()+" "+person.getSurname()+", P/K: "+person.getPersonal_number()+"\nAddress nr."+super.getAddress()+"; Phone: "+super.getPhoneNo();
	}
	
}
