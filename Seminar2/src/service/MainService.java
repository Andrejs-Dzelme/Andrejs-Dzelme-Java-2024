package service;

import java.util.ArrayList;

import Model.Course;
import Model.Degree;
import Model.Grade;
import Model.Professor;
import Model.Student;

public class MainService {

	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>(); //Sarakstam, atšķirībā no masīva nav jānosaka rezervējamo šūnu skaits.
	private static ArrayList<Student> allStudents =  new ArrayList<Student>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	
	
	
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Thiago", "Silva", Degree.master);
		allProfessors.add(pr1);
		allProfessors.add(pr2);
		for(Professor tempPro : allProfessors) {
			System.out.println(tempPro);
		}
		System.out.println();
		
		Student st1 = new Student();
		Student st2 = new Student("Esmeralda", "Zaļā", "290204-12531");
		Student st3 = new Student("Pēteris", "Akmens", "310405-12567");
		allStudents.add(st1);
		allStudents.add(st2);
		allStudents.add(st3);
		for(Student tempSt : allStudents) {
			System.out.println(tempSt);
		}
		System.out.println();
		
		Course c1 = new Course();
		Course c2 = new Course("Augstfrekvenču sistēmas", 2, pr2);
		Course c3 = new Course("Signālu teorija", 4, pr2);
		allCourses.add(c1);
		allCourses.add(c2);
		allCourses.add(c3);
		for(Course tempC : allCourses) {
			System.out.println(tempC);
		}
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(5, st2, c1);
		Grade gr3 = new Grade(6, st2, c2);
		Grade gr4 = new Grade(9, st3, c1);
		Grade gr5 = new Grade(10, st3, c2);
		Grade gr6 = new Grade(6, st3, c3);
		System.out.println();
	
		allGrades.add(gr1);
		allGrades.add(gr2);
		allGrades.add(gr3);
		allGrades.add(gr4);
		allGrades.add(gr5);
		allGrades.add(gr6);
		
		for(Grade tempGr : allGrades) {
			System.out.println(tempGr);
		}
		
		System.out.println();
		try
		{
			System.out.print(st2+": ");
			System.out.println(calculateAVGgrade(st2));
			System.out.print(st2+": ");
			System.out.println(calculateAVGweightedGrade(st2));
			System.out.print(st3+": ");
			System.out.println(calculateAVGgrade(st3));
			System.out.print(st3+": ");
			System.out.println(calculateAVGweightedGrade(st3));
			System.out.print("Visi studenti: ");
			System.out.println(calculateAVGgradeByStudent(st2));
			System.out.print("Vidējā atzīme par kursu: ");
			System.out.println(calculateAVGgradeInCourse(c2));
			System.out.print(pr2+" kursu skaits: ");
			System.out.println(calculateCoursesByProfessor(pr2));
		}
		catch (Exception e) {
			System.out.println(e);
		}

		
	}
	
	//10 4KP
	//5 2KP
	//10*4 + 5*2 = sum
	//howMany = 4KP + 2KP = 6Kp
	//->sum/6KP
	
	public static float calculateAVGgrade(Student student) throws Exception {
		if(student == null) throw new Exception("Problems with input student.");
		
		float sum = 0;
		int howMany = 0;
				
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(student)) {
				sum = sum + tempGr.getValue();
				howMany++;
			}
		}
		if(howMany == 0) throw new Exception("There are no course.");
		
		return sum/howMany;
		
	}
		
	public static float calculateAVGweightedGrade(Student student) throws Exception {
		if(student == null) throw new Exception("Problems with input student.");
		
		float sum = 0;
		int howManyCP = 0;
				
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(student)) {
				sum = sum + tempGr.getValue()*tempGr.getCourse().getCreditPoints();
				howManyCP = howManyCP + tempGr.getCourse().getCreditPoints();
			}
		}
		if(howManyCP == 0) throw new Exception("There are no course.");
		
		return sum/howManyCP;
		
	}

	public static float calculateAVGgradeByStudent(Student inputStudent) throws Exception{
		if(inputStudent == null) throw new Exception("Problems with input arguments.");
		float sum = 0;
		int howMany = 0;
		for(Grade tempGr : allGrades) {
			sum = sum + tempGr.getValue();
			howMany++;
		}
		if(howMany == 0) {return 0;}
		return sum/howMany;
	}
	
	public static float calculateAVGgradeInCourse(Course course) throws Exception{
		if(course == null) throw new Exception("Problems with input arguments.");
		float sum = 0;
		int howMany = 0;
		for(Grade tempGr : allGrades) {
			if(tempGr.getCourse().equals(course)) {
				sum = sum + tempGr.getValue();
				howMany++;
			}
		}
		if(howMany == 0) {return 0;}
		return sum/howMany;
	}
	
	public static float calculateCoursesByProfessor(Professor professor) throws Exception {
		if(professor == null) throw new Exception("Problems with input arguments.");
		int howMany = 0;
		for(Course tempCr: allCourses) {
			 if(tempCr.getProfessor().equals(professor)) {
				 howMany++;
			 }
		}
		if(howMany == 0) {return 0;}
		return howMany;
	}
	
	/*public static void sortStudentsByAVG(Student student) throws Exception {
		if(student == null) throw new Exception("No enough students to sort.");
		
	}*/
	
}