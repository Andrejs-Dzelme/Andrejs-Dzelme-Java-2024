package Model;

public class Course {
public static void main(String[] args) {
		
		int Freq = 50, puls = 50, RPM = 170; //Must be in the "public static void" to be recognised here. This does not work like the global int-s in "C".
		double CurrInt = 13.725;
		String text = "Freq	Pulse	Rpm	CurrInt\n"; //Here tabulations are made by pressing "tab" instead of "space".
		char value = 'A';
		String first = "Current";
		String second = "flows.";
		String changer;
		
		System.out.print(text);
		//System.out.print("Freq\tPulse\tRPM\tCurrInt\n");
		System.out.print(Freq+"\t"+puls+"\t"+RPM+"\t"+CurrInt+"\n");
		System.out.print(value+"\n");
		System.out.print("\n\"test\"\n");
		System.out.print("\\test2\\\n");
		System.out.println("test3\n");
		
		changer = first;
		first = second;
		second = changer;
		
		System.out.print(first+" ");
		System.out.println(second);
		
		
	
	}
}
//-----------------
//fhgfh