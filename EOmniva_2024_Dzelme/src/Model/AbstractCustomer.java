/* AbstractCustomer (9 punkti) - abstrakta klase, no kuras neveidos objektus, bet to izmantot kā bāzes klasi citām klasēm. Satur
idC, address, phoneNo, customerCode, parcels mainīgos;
i. Nodrošināt idC unikāla uzstādīšanu, izmantojot “autoincrement” algoritmu (1 punkts);
ii. setCustomerCode funkciju izveidot abstraktu, jo tā būs jāpārraksta CustomerAsPerson un CustomerAsCompany klasēs
(1 punkts);
iii. Izveidot addNewParcel funkciju, kas ļauj pievienot paciņu pircējam. Šeit noteikti jāpārbauda, vai tāda paciņa jau
neeksistē pircēja paciņu sarakstā (1 punkts); */

package Model;

import java.util.ArrayList;

public abstract class AbstractCustomer extends Person{
	
	//1. variables
	private long cID;
	private static long counter = 0;
	private Address address;
	private String phoneNo;
	private static ArrayList<Parcel> parcels = new ArrayList<Parcel>();
	protected String customerCode;
	public abstract void setCustomerCode();//__________________!!!


	//2. gets and sets
	public long getcID() {
		return cID;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public static ArrayList<Parcel> getParcels() {
		return parcels;
	}
	public String getCustomerCode() {
		return customerCode;
	}

	//_______________________________________________
	public void setcID() {
		cID = counter;
		counter++;
	}
	public void setAddress(Address address) {
		if(address != null) {
			this.address = address;
		}
		else
			this.address = new Address();
	}
	public void setPhoneNo(String phoneNo) {
		if(phoneNo != null && phoneNo.matches("[+0-9]{3}[ 0-9]+")) {
			this.phoneNo = phoneNo;
		}
		else
			this.phoneNo = "+371 00000000";
	}
	public static void setParcels(ArrayList<Parcel> parcels) {//_________________Consultation needed.
		AbstractCustomer.parcels = parcels;
	}
	public void setCustomerCode(String customerCode) {//_________________Consultation needed.
		this.customerCode = cID+"_Person_"+super.getPersonal_number();
	}	

	//3. Constructors
	public AbstractCustomer() {
		setcID();
		setAddress(new Address());
		setPhoneNo(phoneNo.toString());
		setParcels(parcels);
		setCustomerCode();		
	}	
	public AbstractCustomer(Address address, String phoneNo) {
		setcID();
		setAddress(address);
		setPhoneNo(phoneNo);
		setParcels(parcels);
		setCustomerCode();		
	}	

	//4. toString
	public String toString() {
		return "Customer: "+cID+", Address: "+address+"\nPhone: "+phoneNo+"\nCustomer code: "+customerCode;
	}

	//iii. Izveidot addNewParcel funkciju, kas ļauj pievienot paciņu pircējam. Šeit noteikti jāpārbauda, vai tāda paciņa jau
	//neeksistē pircēja paciņu sarakstā (1 punkts); */
	
}
