package service;

import java.util.Arrays;
import java.util.Random;


/**
 * Main service for seminal 1
 * @author Andrejs Dzelme
 */

public class MainService {
	
	private static final double GRAVITY = -9.8; //______________Constants written capitalized.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Andrejs", "Andrejs", "Andrejs", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Andrejs", "Daniel", "Andrejs", "Aaron",
				"Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
				299, 343, 317, 265 };
		//int arraySize = names.length;
		//int arraySize2 = times.length;	
				
		/*System.out.println("Masīvs 1"); //"Syso" + ctrl + space = "System.out.println();" //___________Clarifying array sizes for the ex 0.
		System.out.println(arraySize);
		System.out.println("Masīvs 2");
		System.out.println(arraySize2);*/

		//___________________________________________________________________Exercise 0_______________________________________________
		System.out.println("_________________________________Exercise 0____________________");
		for (int i = 0; i != 16; i++) {
			System.out.print(names[i]+"\t");
			System.out.println(times[i]);
		}
		
		//___________________________________________________________________Exercise 0 end__________________________________________/
		
		
		//___________________________________________________________________Exercise 1_______________________________________________		

		System.out.println("\n_________________________________Exercise 1____________________");
		try {
			System.out.println("Final position: "+positionCalc(0, 0, 10));
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		//___________________________________________________________________Exercise 1 end__________________________________________/
		
		
		//___________________________________________________________________Exercise 2_______________________________________________	
		short N = 6;
		long factorial = 1;
		
		for (int i = 0; i != N; i++) {
			factorial = factorial * (i+1);
		}
		System.out.println("\n_________________________________Exercise 2____________________");
		System.out.println("(\"for\" loop)");
		System.out.println("Factroial of "+N+" is "+factorial+".");
		System.out.println("(recursive function)");
        System.out.println("Factroial of "+N+" is "+factorial2(N)+".");	
		//___________________________________________________________________Exercise 2 end__________________________________________/
        
        
        //___________________________________________________________________Exercise 3_______________________________________________	
        System.out.println("\n_________________________________Exercise 3____________________");
        
        double lower = 0.3;
        double upper = 0.6;
		try {
			System.out.println(Arrays.toString(generateArray(N, lower, upper)));
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
        //___________________________________________________________________Exercise 3 end__________________________________________/     
        
        
        //___________________________________________________________________Exercise 4_______________________________________________        
		System.out.println("\n_________________________________Exercise 4____________________\n");
		short horiz = 6;
        short vert = 5;
        short Low = 1;
        short High = 99;
        
        generateMatrix(vert, horiz, Low, High);     
        //___________________________________________________________________Exercise 4 end__________________________________________/ 
        
        
        //___________________________________________________________________Exercise 5-1_____________________________________________
        System.out.println("\n_________________________________Exercise 5-1____________________");
        int flips = 100;       
        System.out.println(Arrays.toString(coinFlip(flips)));
        //___________________________________________________________________Exercise 5-1 end________________________________________/        
        
        
        //___________________________________________________________________Exercise 5-2_____________________________________________  
        System.out.println("\n_________________________________Exercise 5-2____________________");   	
    	System.out.println(Arrays.toString(rollDice(flips)));
        //___________________________________________________________________Exercise 5-2 end________________________________________/        
    	
    	
    	//___________________________________________________________________Exercise 5-3_____________________________________________
    	System.out.println("\n_________________________________Exercise 5-3____________________");
    	System.out.println("You rolled "+roll2Dices()+" times to get 2 sixes.");    	
    	//___________________________________________________________________Exercise 5-3 end________________________________________/    
    	
    	
    	//___________________________________________________________________Exercise 6_______________________________________________ 
    	System.out.println("\n_________________________________Exercise 6____________________");
    	int[] secretText = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
    			32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
    	/*int arraySize3 = secretText.length;
    	short i = 0;
    	
    	do {       	
    		char c=(char)secretText[i];
        	System.out.print(c);  
        	i++;
    		arraySize3--;
    	}while (arraySize3 > 0);*/
    	decodeSecret(secretText);
    	System.out.println();
    	//___________________________________________________________________Exercise 6 end__________________________________________/
    	
    	
    	//___________________________________________________________________Exercise 7_______________________________________________ 
    	System.out.println("\n_________________________________Exercise 7____________________\n");
    	short rows = 8;
    	short Nr = rows;
    	Nr++;
    	double[] Number = new double[Nr];
        	
    	for (short f = 0; f < Nr; f++) {//_________________This is taken from internet sources.
    		Number[f] = factorial2(rows)/(factorial2(f)*factorial2(rows-f));
    	}   	
    	System.out.println(Arrays.toString(Number)); 
    	//___________________________________________________________________Exercise 7 end__________________________________________/
    	
    	
    	//___________________________________________________________________Exercise 8*______________________________________________     	
    	String expression = "1 - 3 * 18 / 4 + 1";
    	char[] ch = new char[expression.length()];
    	int digit = 0;
    	int prev = 0;
    	int driver = -1;
    	int[] num = new int[30];
    	double[] num2 = new double[30];
    	short informer = 0;
    	
    	System.out.println("\n_________________________________Exercise 8*____________________\n");//______________________________Kind of done. Just don't start with negatives!
    	for (short e = 0; e < expression.length(); e++) {//_________________This is taken from internet sources.
    		ch[e] = expression.charAt(e);
    		System.out.print(ch[e]);
    	}
    	System.out.println();
    	//System.out.println(Arrays.toString(ch)); 
    	for (short f = 0; f < expression.length(); f++) {
    		digit = ch[f]-48;
    		
    		if (digit >= 0 && digit <= 9 && f == 0) {
    			num[f] = digit;
    			informer = 1;
    		}
    		else if (digit >= 0 && digit <= 9 && f > 0 && informer == 1) {
    			prev = num[f-1];
    			num[f] = digit + (prev * 10);
    			informer = 1;
    			if (f == expression.length() - 1) {
    				//System.out.print(num[f]);
    				driver++;
    				num2[driver] = num[f];
    			}
    		}
    		else if (digit >= 0 && digit <= 9 && f > 0 && informer == 0) {
    			num[f] = digit;
    			informer = 1;
    			if (f == expression.length() - 1) {
    				//System.out.print(num[f]);
    				driver++;
    				num2[driver] = num[f];
    			}
    		}
    		else if ((digit < 0 || digit > 9) && f > 0 && informer == 1){
    			informer = 0;
    			//System.out.print(num[f-1]+" ");
				driver++;
				num2[driver] = num[f-1];
    		}
    	}
    	//System.out.println();
    	//System.out.println(Arrays.toString(num2)); 
    	driver = 0;
    	informer = 0;
    	short[] prioritySel = new short [30];
    	short[] definer = new short [30];
    	double mediaRes = 0;
    	double higherRes = 0;
    	
    	for (short f = 0; f < expression.length(); f++) {
    		if (ch[f] == '-') {   			
    			prioritySel[driver] = 2;
    			driver++;
    		}    		
    		else if (ch[f] == '+') {    			
    			prioritySel[driver] = 3;
    			driver++;
    		}
    		else if (ch[f] == '*') {    			
    			prioritySel[driver] = 1;
    			driver++;
    		}
    		else if (ch[f] == '/') {    			
    			prioritySel[driver] = 0;
    			driver++;
    		}
    		else {
    			prioritySel[driver] = 3;
    		}
    	}
    	
    	short driver2 = 0;
    	for (short f = 0; f < expression.length(); f++) {
    		if (ch[f] == '-') {
    			driver2++;
    			definer[driver2-1] = 0;
    		}    		
    		else if (ch[f] == '+') {
    			driver2++;
    			definer[driver2-1] = 1;   			
    		}
    	}
    	//System.out.println("driver: "+driver);
    	
    	for (short f = 0; f < driver; f++) {
    		if (definer[f] == 0) {
    			num2[f] = num2[f] * 1;
    		}
    		else if(definer[f] == 1) {
    			num2[f] = num2[f] * -1;   			
    		}
    	}
    	
    	for (short f = 0; f <= driver; f++) {
    		if (prioritySel[f] == 1) {
    			f++;
    			higherRes = (num2[f-1] * num2[f]);
    			num2[f] = higherRes;
    			f--;
    		}
    		else if (prioritySel[f] == 0) {
    			f++;
    			higherRes = (num2[f-1] / num2[f]);
    			num2[f] = higherRes;
    			f--;
    		}
    		else if (prioritySel[f] == 2 || prioritySel[f] == 3){
    			mediaRes = mediaRes + num2[f];
    		}
    	}
  
    	//digit = ch[4]-48;
    	//System.out.println(Arrays.toString(prioritySel)); 
    	//System.out.println(Arrays.toString(definer)); 
    	//System.out.println(Arrays.toString(num2)); 
    	System.out.println("The result is "+mediaRes+".");
    	//___________________________________________________________________Exercise 8* end_________________________________________/
	}	
	

	static long factorial2(int n) {//___________________________This is recursive function for the Exercise 2.
        if (n != 0)  // termination condition
            return n * factorial2(n-1); // recursive call
        else
            return 1;	
	}	
	
	public static double positionCalc(double initialVelocity, double initialPosition, double fallingTime) throws Exception{
		if (initialPosition >= 0 && initialPosition >= 0 && fallingTime >= 0) {			
			return 0.5 * GRAVITY * Math.pow(fallingTime, 2) + initialVelocity * initialPosition;
		}
		else {
			throw new Exception("You must input fittable parameters. No negatives!");			
		}
	}
	
	public static double[] generateArray(int N, double lower, double upper) throws Exception {
		if (N <= 0 || (upper < lower)) throw new Exception("Wrong input parameters!");
		
		double[] result = new double[N];
		double result2 = 0;
		double result3 = 0;
		double result4 = 0;
		Random rand = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = rand.nextDouble(lower, upper);
			
			if (i == 0) {
				result2 = result[i];
				result3 = result[i];
			}
			else if (i > 0 && result2 < result[i]) {//______________________Finding Max value.
				result2 = result[i];
			}
    		else if (i > 0 && result3 > result[i]) {//______________________Finding Min value.
    			result3 = result[i];
    		}  
			result4 = result4 + result[i];			
		}		
		
		result4 = result4 / result.length;
		System.out.println("Max val: "+result2);
		System.out.println("Min val: "+result3);
		System.out.println("Mean val: "+result4);
		Arrays.sort(result);
		return result;
		
		//return result2;
	}
	
	public static double getMax(double[] generateArray) throws Exception {
		double result = 0;
			if (generateArray.length > 0) {
				for (int i = 0; i < generateArray.length; i++) {
					if (i == 0) {
						result = generateArray[i];
					}
					else if (i > 0 && result < generateArray[i]) {//______________________Finding Max value.
						result = generateArray[i];
					}
				}
				return result;
			}
			else {
				throw new Exception ("The array must be greater then 0.");
			}
	}

	public static void generateMatrix(int vert, int horiz, int Low, int High){
		double[] generateArray2 = new double[horiz];
	    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for (short e = 0; e-1 != vert; e++) {//__________________________Generating rows.
        	if (e == 0) {//__________________________________ABC cycle____________
        		short f = 0;
        		System.out.print(" \t");
        		for (char c = 'A'; c <= 'Z'; c++) {           			
        			f++;        			
        			if (f <= horiz) {
            			alphabet[c - 'A'] = c;
            			System.out.print(alphabet[c - 'A']+"\t");         			 
        			}
        			else {
        				c = 'Z';       				
        			}
        		}
        	}//__________________________________ABC cycle end____________________/
        	else {
        		System.out.print(e+"\t");
	        	for (short g = 0; g != horiz; g++) {//_____________________Generating columns.
		        	generateArray2[g] = (short)(Math.random()*100);
		        	if (generateArray2[g] > High || generateArray2[g] < Low) {
		        		g--;
		        		}
		        	else {
		        		long noDeci = Math.round(generateArray2[g]);//_______________Taking off decimals.
		        		System.out.print(noDeci+"\t");
		        		}
		        	}	        	
        	}
        	System.out.println();//________________________New row.		
		}
	}
	public static double [] coinFlip(int flips) {
		int heads = 0;
        int tails = 0;
        double ratio = 0;
        short comparator = 0;
        short low2 = 0;
        short high2 = 100;
        double result[] = new double[3];
        
        for (short i = 0; i != flips; i++) {
        	comparator = (short)(Math.random()*100);
        	if (comparator > high2 || comparator < low2) {
        		i--;
        		}        	
        	else if (comparator >= 0 && comparator < 50) {
        		heads++;
        	}
        	else if (comparator >= 50 && comparator <100) {
        		tails++;
        	} 
        	result[0] = heads;
        	result[1] = tails;
        }
    	ratio = result[0]/result[1];
    	result[2] = ratio;
        return result;
	}
	public static int [] rollDice(int flips) {
        short[] dice = new short[flips];
        short ones = 0;
        short twos = 0;
        short threes = 0;
        short fours = 0;
        short fives = 0;
        short sixes = 0;
        int result[] = new int[6];
       
        for (short i = 0; i != flips; i++) {
        	dice[i] = (short)(Math.random()*100);
        	if (dice[i] > 6 || dice[i] < 1) {
        		i--;
        	}  
        	else {
        		long noDeci = Math.round(dice[i]);//_______________Taking off decimals.
        		//System.out.print(noDeci+" ");
        		if (noDeci == 1) ones++;
        		else if (noDeci == 2) twos++;
        		else if (noDeci == 3) threes++;
        		else if (noDeci == 4) fours++;
        		else if (noDeci == 5) fives++;
        		else if (noDeci == 6) sixes++;
        	}       	
        }
        result[0] = ones;
        result[1] = twos;
        result[2] = threes;
        result[3] = fours;
        result[4] = fives;
        result[5] = sixes;
       
        return result;
	}
	public static int roll2Dices() {
    	short dice1 = 1;
    	short dice2 = 1;
    	int tries = 0;
    	do {
    		tries++;
    		dice1 = (short)(Math.random()*100);
    		dice2 = (short)(Math.random()*100);
    		if ((dice1 < 1 || dice1 > 6 ) && (dice2 < 1 || dice2 > 6 )) {
    			tries--;
    		}
    	}while (dice1 != 6 && dice2 != 6);
    	return tries;
	}
	public static void decodeSecret(int [] secretText) {
    	int arraySize3 = secretText.length;
    	short i = 0;
    	do {       	
    		char c=(char)secretText[i];
        	System.out.print(c);  
        	i++;
    		arraySize3--;
    	}while (arraySize3 > 0);
	}
	
}
