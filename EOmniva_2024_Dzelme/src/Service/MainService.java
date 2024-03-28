package Service;

import Model.*;

//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MainService {

    public static ArrayList<Driver> allDrivers = new ArrayList<Driver>();
    public static ArrayList<AbstractCustomer> allCustomers = new ArrayList<AbstractCustomer>();


    public static void main(String[] args){

        Person pe1 = new Person();
        Person pe2 = new Person("Malvīne", "Leopoldīne", "131006-12634");
        Person pe3 = new Person("Aivariš", "Puzēns", "131266-17698");
        System.out.println(pe1);
        System.out.println(pe2);
        System.out.println(pe3);

        System.out.println("\nDriver CRUD________________________________________\n");
        //c-i.
        Driver dr1 = new Driver();
        Driver dr2 = new Driver("Blondīne", "Bembiste", "136913-69666", "AT136660", 3);
        Driver dr3 = new Driver("Zigismunds", "Stūrvaldis", "100656-13324", "AT777100", 26);
        allDrivers.addAll(Arrays.asList(dr1, dr2, dr3));
		/*for(Driver tempDr : allDrivers) {
			System.out.println(tempDr);
		}
		System.out.println();*/
        
        //c-ii.
        try
        {
            Driver temptDF = retrieveDriverByPersonal_number("136913-69666");
            System.out.println("The driver found: "+temptDF);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        //c-iii.
        try
        {
            updateDriverLicenceNoByPersonal_number("100656-13324", "AT777101");
            System.out.println("Licence updated: "+dr3);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //c-iv.
        try
        {
            updateDriverExperienceByPersonal_number("136913-69666", 4);
            System.out.println("Experience updated: "+dr2);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //c-v.
        try {
            deleteDriverByPersonal_number("136913-69666");
            System.out.println("All drivers: ");
            System.out.println(allDrivers);
        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("Customer CRUD________________________________________");

        CustomerAsCompany c1 = new CustomerAsCompany(); //Address(City city, String streetOrHouseTitle, int houseNo) 

        Address address_c2 = new Address(City.Talsi, "Lidlauka iela", 99);
        CustomerAsCompany c2 = new CustomerAsCompany(address_c2, "+371 28909013", "SIA Planieru spārnu tīrītava", "12345678");
        //CustomerAsCompany(Address address, String phoneNo, String title, String companyRegNo) 

        Address address_c3 = new Address(City.Daugavpils, "Sarkanā iela", 9);
        CustomerAsPerson c3 = new CustomerAsPerson("Leonīds", "Ķurmišņikovs", "150941-20087", address_c3, "+792 513419666");
        //(String name, String surname, String personal_number, Address address, String phoneNo)

        Address address_c4 = new Address(City.Riga, "Lielirbes iela", 88);
        CustomerAsPerson c4 = new CustomerAsPerson("Ilgvars", "Miķelsons", "213328-14543", address_c4, "27789380");

        Address address_c5 = new Address(City.other, "Jādekšas, Laucienes pagasts", 0);
        Address address_c6 = new Address(City.other, "Ezermales, Laidzes pagasts", 0);

        allCustomers.add(c1);
        allCustomers.add(c2);
        allCustomers.add(c3);
        allCustomers.add(c4);
        //System.out.println(allCustomers);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.println(c4);

        //d-i.
        System.out.print("All customers as persons:\n");
        try{
        retrieveAllCustomersAsPerson(allCustomers);
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        //d-ii.        
        System.out.println("All customers as companies:\n");
        try{
            retrieveAllCustomersAsCompany(allCustomers);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //d-iii. 
        System.out.println("New customer as person:\n");
        try {
            CustomerAsPerson c5 = createNewCustomerAsPerson("Māris", "Štepsels", "220398-14220", address_c5, "+371 25258363");
            allCustomers.add(c5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(allCustomers);

        //d-iv.
        try {
            CustomerAsCompany c6 = createNewCustomerAsCompany(address_c6, "+371 22627862", "ZS Piena kazu fazenda", "12344321");
            allCustomers.add(c6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(allCustomers);
        System.out.println(c4.getCustomerCode());
        

    }


    //RETRIEVE
    public static Driver retrieveDriverByPersonal_number(String personal_number) throws Exception{
        //Checks personal_number
        if(personal_number == null) {
            throw new Exception("Problems with input parameters");
        }
        //Finds the driver
        for(Driver tempSt: allDrivers) {
            if(tempSt instanceof Driver){
                if(tempSt.getPersonal_number().equals(personal_number)) {
                    return (Driver) tempSt;
                }
            }
        }
        //4. pēc foreach cikla beigām izmest izņemu, ka tāds driver neeksistē sistemā
        throw new Exception("Driver with personal_number " + personal_number
                + " is not registered in the system");
    }
    public static void updateDriverLicenceNoByPersonal_number(String personal_number, String newLicenseNo) throws Exception {
        if(personal_number == null || newLicenseNo == null) {
            throw new Exception("Problems with input parameters");
        }
        for(Driver tempSt: allDrivers) {
            if(tempSt instanceof Driver){
                if(tempSt.getPersonal_number().equals(personal_number))
                {
                    if (!tempSt.getLicenseNo().equals(newLicenseNo))
                    {
                        tempSt.setLicenseNo(newLicenseNo);
                    }
                    return;
                }
            }
        }
        throw new Exception("Driver with personal_number " + personal_number
                + " is not registered in the system");
    }
    public static void updateDriverExperienceByPersonal_number(String personal_number, float newExperience) throws Exception {
        if(personal_number == null || newExperience <= 0 || newExperience >= 100) {
            throw new Exception("Problems with input parameters");
        }
        for(Driver tempSt: allDrivers) {
            if(tempSt instanceof Driver){
                if(tempSt.getPersonal_number().equals(personal_number))
                {
                    if (Float.compare(tempSt.getExperienceInYears(), newExperience) != 0)
                    {
                        tempSt.setExperienceInYears(newExperience);
                    }
                    return;
                }

            }
        }
        throw new Exception("Driver with personal_number " + personal_number
                + " is not registered in the system");
    }
    public static void deleteDriverByPersonal_number(String personal_number) throws Exception{
        //Checks input arguments
        if(personal_number == null) {
            throw new Exception("Problems with input parameters");
        }
        //Find the driver to delete
        for(Driver tempSt: allDrivers) {
            if(tempSt instanceof Driver) {
                if (tempSt.getPersonal_number().equals(personal_number)) {
                    //Delete the driver
                    allDrivers.remove(tempSt);
                    return;
                }
            }
        }
        throw new Exception("Student with personal_number " + personal_number
                + " is not registered in the system");
    }
    public static ArrayList<CustomerAsCompany> retrieveAllCustomersAsCompany(ArrayList<AbstractCustomer> customers) throws Exception {
        if(customers == null) {
            throw new Exception("Problems with input parameters");
        }
        ArrayList<CustomerAsCompany> companyCustomers = new ArrayList<>();
        for (AbstractCustomer customer : customers) {
            if (customer instanceof CustomerAsCompany) {
                System.out.println(customer);
                companyCustomers.add((CustomerAsCompany) customer);
            }
        }

        if (companyCustomers.isEmpty()) {
            throw new Exception("No company customers found");
        }

        return companyCustomers;
    }
    public static ArrayList<CustomerAsPerson> retrieveAllCustomersAsPerson(ArrayList<AbstractCustomer> customers) throws Exception {
        if(customers == null) {
            throw new Exception("Problems with input parameters");
        }

        ArrayList<CustomerAsPerson> personCustomers = new ArrayList<>();

        for (AbstractCustomer customer : customers) {
            if (customer instanceof CustomerAsPerson) {
                System.out.println(customer);
                personCustomers.add((CustomerAsPerson) customer);
            }
        }

        if (personCustomers.isEmpty()) {
            throw new Exception("No company customers found");
        }

        return personCustomers;
    }
    public static CustomerAsPerson createNewCustomerAsPerson(String name, String surname, String personal_number, Address address, String phone) throws Exception {
        if (name == null || surname == null || personal_number == null || address == null || phone == null) {
            throw new Exception("Problems with input parameters");
        }

        return new CustomerAsPerson(name, surname, personal_number, address, phone);
    }
    public static CustomerAsCompany createNewCustomerAsCompany(Address address, String phoneNo, String title, String companyRegNo) throws Exception {
        if (address == null || phoneNo == null || title == null || companyRegNo == null) {
            throw new Exception("Problems with input parameters");
        }

        return new CustomerAsCompany(address, phoneNo, title, companyRegNo);
    }




    public static void addNewParcelToCustomer(String personal_number, Parcel parcel, ArrayList<AbstractCustomer> customers) {
        // Pārbauda, vai ir norādīts pareizs customerCode un vai paciņa ir derīga
        if (personal_number == null || parcel == null) {
            System.out.println("Failed to add parcel.");
            return;
        }
    }//_______________________Not finished 28-03-2024

 /*       AbstractCustomer customer = findCustomerByCode(customerCode, ArrayList<AbstractCustomer> customers){
        if (customer == null) {
            System.out.println("Pircējs ar norādīto customerCode nav atrasts.");
            return;
        }

        customer.addNewParcel(parcel);
    }

    private static AbstractCustomer findCustomerByCode(String customerCode, ArrayList<AbstractCustomer> customers) {
        for (AbstractCustomer customer : customers) {
            if (customer.getCustomerCode().equals(customerCode)) {
                return customer;
            }
        }
        return null;
    }*/








}