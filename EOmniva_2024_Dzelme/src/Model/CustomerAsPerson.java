package Model;

public class CustomerAsPerson extends AbstractCustomerAsPerson{
	//1. Variables
	private String  customerCode;
	private AbstractCustomer cID;
	//private String holder = person.getPersonal_number();

	//2. gets and sets
	public String getCustomerCode() {
		return customerCode;
	}
	
	//3. Constructors
	public CustomerAsPerson() {
		super();
	}	
	public CustomerAsPerson(String name, String surname, String personal_number, Address address, String phoneNo) {
		super(name, surname, personal_number, address, phoneNo);
	}
	
	//4. toString
	public String toString() {
		return person.getName()+" "+person.getSurname()+", P/K: "+person.getPersonal_number()+"\nAddress: "+super.getAddress()+"; Phone: "+super.getPhoneNo()+"\n";
	}
	
	//5. other functions
	public void setCustomerCode() {
		this.customerCode = cID+"_Person_"+super.getPersonal_number();//holder.toString(); Not working correctly
	}

}
