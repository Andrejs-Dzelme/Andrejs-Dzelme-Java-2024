package Model.user;

import java.util.ArrayList;

import Model.Page;
import Model.PostType;

public class BusinessUser extends RegisteredUser{
	//1. variables
	private String VATNo; //LV90000345676
	private ArrayList<Page> allUserPages = new ArrayList<Page>();
	
	//2. gets and sets
	public String getVATNo() {
		return VATNo;
	}

	//____________________________________________________
	public void setVATNo(String vATNo) {
		if(vATNo != null && vATNo.matches("[A-Z]{2}[0-9]{11}"))
			vATNo = vATNo;
		else
			VATNo = "_____________";
	}

	@Override
	public void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle) {
		if(nameAndSurnameOrTitle != null && nameAndSurnameOrTitle.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]{2,20} [A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]{2,30}")) {
			super.nameAndSurnameOrTitle = nameAndSurnameOrTitle;
		}
		else
			super.nameAndSurnameOrTitle = "______________";		
	}
	
	//3. constructors
	public BusinessUser(){
		super();
		setNameAndSurnameOrTitle("Ventspils motoservis \"Čuhņā ir!\"");
		setUsername();
		setVATNo("LV90000345676");
	}
	public BusinessUser(String title, String password, String vATNo){
		super(password);
		setNameAndSurnameOrTitle(title);
		setUsername();
		setVATNo(vATNo);		
	}	
	
	//4. toString
	public String toString() {
		return super.toString() + "[VAT No: ]" + VATNo;
	}
	
	//5. other functions
	public void addPage(String title, String description) throws Exception{
		for(Page tempP: allUserPages) {
			if(tempP.getTitle().toLowerCase().equals(title.toLowerCase())) {
				throw new Exception("Page already exists.");
			}
		}
		Page newPage = new Page(title, description);
		allUserPages.add(newPage);
	}
	
	public void publishPostPage(String postTitle, String msg, String pageTitle) {
		
	}
	
	@Override
	public void publishPost(String title, String msg, PostType type) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
