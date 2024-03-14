package Model;

import java.time.LocalDateTime;

public class Post {
	//1.variable
	private String title;
	private String msg;
	private LocalDateTime dateTime = LocalDateTime.now();
	//TODO pārtaisīt uz User sarakstu (lai lietotājs var tikai vienu reizi atzīmēt).
	private int countOfLikes = 0;
	private int countOfDislikes = 0;
	
	//2.get and set	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.length() >= 5 && title.length() <= 50)
			this.title = title;
		else
			this.title = "Bez nosaukuma";
	}
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		if(title != null && title.length() >= 5 && title.length() <= 1000)
			this.msg = msg;
		else
			this.msg = "Nav ziņu.";
	}
	
	
	public int getCountOfLikes() {
		return countOfLikes;
	}
	public void setCountOfLikes(int countOfLikes) {
		this.countOfLikes = countOfLikes;
	}
	
	
	public int getCountOfDislikes() {
		return countOfDislikes;
	}
	public void setCountOfDislikes(int countOfDislikes) {
		this.countOfDislikes = countOfDislikes;
	}
	
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void incrementCountOfLikes() {
		countOfLikes++;
	}
		
	//3.constructors
	public Post() {
		setTitle("Test tile");
		setMsg("Test description.");		
	}
	
	public Post(String title, String msg) {
		setTitle(title);
		setMsg(msg);		
	}	
	
	//4.toString
	public String toString() {
		return title + " (" + dateTime + ")\n\n" + msg + "\n\n[" + countOfLikes + "]\n";
	}
	
	//5.other functions
	
}
