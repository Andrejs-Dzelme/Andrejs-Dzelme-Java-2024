/* AbstractCustomer (9 punkti) - abstrakta klase, no kuras neveidos objektus, bet to izmantot kā bāzes klasi citām klasēm. Satur
idC, address, phoneNo, customerCode, parcels mainīgos;
i. Nodrošināt idC unikāla uzstādīšanu, izmantojot “autoincrement” algoritmu (1 punkts);
ii. setCustomerCode funkciju izveidot abstraktu, jo tā būs jāpārraksta CustomerAsPerson un CustomerAsCompany klasēs
(1 punkts);
iii. Izveidot addNewParcel funkciju, kas ļauj pievienot paciņu pircējam. Šeit noteikti jāpārbauda, vai tāda paciņa jau
neeksistē pircēja paciņu sarakstā (1 punkts); */

package Model;

import java.util.ArrayList;

public abstract class AbstractCustomer {
	//1. variables
	private long cID;
	private static long counter = 0;
	private Address address;
	private String phoneNo;
	private static ArrayList<Parcel> allParcels = new ArrayList<Parcel>();
	protected String customerCode;


	//2. gets and sets
	public long getcID() {
		return cID;
	}
	public void setcID(long cID) {
		cID = counter;
		counter++;
	}
	
	

}
