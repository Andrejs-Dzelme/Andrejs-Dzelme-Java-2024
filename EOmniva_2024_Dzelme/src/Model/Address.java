//Address (6 punkti) - paredzēta pircēju adreses glabāšanai - city, streetOrHouseTitle, houseNo;

package Model;

public class Address {
	//1. variables
	private City city;
	private String streetOrHouseTitle;
	private int houseNo;
	
	//2.gets and sets
	public City getCity() {
		return city;
	}
	public String getStreetOrHouseTitle() {
		return streetOrHouseTitle;
	}
	public int getHouseNo() {
		return houseNo;
		
	}
	public void setCity(City city) {
		if(city != null)
			this.city = city;
		else
			this.city = City.other;
	}	
	public void setStreetOrHouseTitle(String streetOrHouseTitle) {
		if(streetOrHouseTitle != null)
			this.streetOrHouseTitle = streetOrHouseTitle;
		else
			this.streetOrHouseTitle = "Undefined";
	}
	public void setHouseNo(int houseNo) {
		if(houseNo > 0) {
			this.houseNo = houseNo;
		}
		else
			this.houseNo = 1;
	}
	
	//3. Constructors
	public Address() {
		setCity(City.other);
		setStreetOrHouseTitle("Street");
		setHouseNo(0); 		
	}	
	
	public Address(City city, String streetOrHouseTitle, int houseNo) {
		setCity(city);
		setStreetOrHouseTitle(streetOrHouseTitle);
		setHouseNo(houseNo); 		
	}		

	//4. toString
	public String toString() {
		return city + ", " + streetOrHouseTitle + ", " + houseNo;
	}

}
