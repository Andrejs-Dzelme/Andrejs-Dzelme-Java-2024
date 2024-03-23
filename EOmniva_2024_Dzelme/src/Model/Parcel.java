/* Parcel (9 punkti) - paredzēta paciņu datu glabāšanai. Satur sekojošus mainīgos:
i. isFragile,
ii. size,
iii. orderCreated (jāuztaisa tā, lai paciņas izveides brīdī tiek saglabāts tā brīža datums un laiks) (1 punkts),
iv. plannedDelivery (nedrīkst būt mazāks kā šīs dienas datums) (1 punkts);
v. price (cena ir aprēķināma sekojošā veidā - (size(1-X, 2-S, 3-M, 4-L, 5-XL) *1.99) +2.99(ja paciņa ir trausla)(1 punkts)
vi. Driver - paciņas piegādes kurjers. */


package Model;

import java.time.LocalDateTime;

public class Parcel {
	
	//1. variables
	private LocalDateTime orderCreated = LocalDateTime.now();
	private LocalDateTime plannedDelivery = LocalDateTime.now();
	private ParcelSize parcelSize;
	private float price;
	private boolean isFragile;
	private Driver driver;
	
	//2. gets and sets
	public LocalDateTime getOrderCreated() {
		return orderCreated;
	}
	public LocalDateTime getPlannedDelivery() {
		return plannedDelivery;
	}
	public ParcelSize getParcelSize() {
		return parcelSize;
	}
	public float getPrice() {
		return price;
	}
	public boolean isFragile() {
		return isFragile;
	}
	public Driver getDriver() {
		return driver;
	}
	
	//________________________________________________________________________
	public void setOrderCreated() {
		this.orderCreated = LocalDateTime.now();
	}
	public void setPlannedDelivery(LocalDateTime plannedDelivery) {//___________________________improve!
		plannedDelivery.isAfter(LocalDateTime.now().plusDays(1));
		this.plannedDelivery = plannedDelivery;
	}
	public void setParcelSize(ParcelSize parcelSize) {	
		if(parcelSize != null)
			this.parcelSize = parcelSize;
		else
			this.parcelSize = ParcelSize.XXL;
	}	
	public void setPrice() {
		if (parcelSize == ParcelSize.S)
			this.price = (float) (1.99);
		else if (parcelSize == ParcelSize.M)
			this.price = (float) (1.99*2);
		else if (parcelSize == ParcelSize.L)
			this.price = (float) (1.99*3);
		else if (parcelSize == ParcelSize.XL)
			this.price = (float) (1.99*4);
		else if (parcelSize == ParcelSize.XXL)
			this.price = (float) (1.99*5);
		
		if (parcelSize == ParcelSize.S && isFragile)
			this.price = (float) (1.99+2.99);
		else if (parcelSize == ParcelSize.M && isFragile)
			this.price = (float) (1.99*2+2.99);
		else if (parcelSize == ParcelSize.L && isFragile)
			this.price = (float) (1.99*3+2.99);
		else if (parcelSize == ParcelSize.XL && isFragile)
			this.price = (float) (1.99*4+2.99);
		else if (parcelSize == ParcelSize.XXL && isFragile)
			this.price = (float) (1.99*5+2.99);
	}	
	public void setFragile(boolean isFragile) {
		if (isFragile == true) {
			this.isFragile = isFragile;
		}
		else
			this.isFragile = false;
	}
	public void setDriver(Driver driver) {
		if(driver!= null) {
			this.driver = driver;
		}
		else
			this.driver = new Driver();
	}
	
	//3. Constructors
	public Parcel() {
		setPlannedDelivery(plannedDelivery);
		setParcelSize(ParcelSize.XXL);
		setFragile(false);
		setDriver(new Driver());
	}	
	public Parcel(ParcelSize parcelSize, boolean isFragile, Driver driver, LocalDateTime plannedDelivery) {
		setPlannedDelivery(plannedDelivery);
		setParcelSize(parcelSize);
		setFragile(isFragile);
		setDriver(driver);
	}
	
	//4. toString
	public String toString() {
		return "Parcel "+parcelSize+" will arrive until "+plannedDelivery+".";
	}
	

	
	
	
}
