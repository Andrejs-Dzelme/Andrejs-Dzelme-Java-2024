package Model;

import java.util.ArrayList;

public class Page {
	//1. variable
	private String title;
	private String description;
	private ArrayList<Post> publicPosts = new ArrayList<Post>();
	private ArrayList<Post> privatePosts = new ArrayList<Post>();
	
	//2. gets and sets	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<Post> getPublicPosts() {
		return publicPosts;
	}
	public ArrayList<Post> getPrivatePosts() {
		return privatePosts;
	}
	//____________________________________________________
	public void setTitle(String title) {
		if(title != null && title.length() >= 5 && title.length() <= 50)
			this.title = title;
		else
			this.title = "Bez nosaukuma.";
	}
	public void setDescription(String description) {
		if(title != null && description.length() >= 10 && description.length() <= 200)
			this.description = description;
		else
			this.description = "Nav apraksta.";
	}
	
	//3. constructors
	

	
}
