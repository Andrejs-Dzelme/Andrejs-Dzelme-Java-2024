package service;

import Model.Degree;
import Model.Professor;
import Model.Student;

public class MainService {
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Thiago", "Silva", Degree.master);
		System.out.println(pr1);
		System.out.println(pr2);
		
		
	}
	
	
}
