//import java.util.Scanner;

public class week3_codingAssigment {

	
/*	public static void main(String[] args) {
		
		double[] randoNums = new double[]{45.65, 66.9, 151, 18.23, 37.5};
		double[] otherNums = new double[] {67.5, 107.5, 21.6, 10, 3.56, 300};
		int[] myNumNums = new int[]{5, 6, 7, 100};
		
		problem("Mudblood", 7);
		System.out.println("My name is " + fullName("Kristian", "Pador"));
		System.out.println("The average is " + meElements(randoNums));
		System.out.println("Is the sum greater than 100? " + bigSum(myNumNums));
		System.out.println("Is it greater? " + isItGreater(randoNums, otherNums));
		System.out.println("Will I buy a drink? " + willBuyDrink(true, 9.99));
		System.out.println("Can I buy the item? " + canIBuyIt(80.00, 99.99));
		

 	
		// 1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 105};
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		// a) Programmatically subtract the value of the first element in the array from the value in the last element of the array.
		
		int newAge = ages[ages.length - 1] - ages[0] ;
		System.out.println("Difference of the last and first elements: " + newAge);
		
		// b) Add a new age to your array and repeat the step above to ensure it is dynamic
		// c) Use a loop to iterate through the array and calc the average
		int sum = 0;
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
			}
		
		double ave = ((double)sum / ages.length);
		System.out.println("The average of the array is : " + ave);
		}



		
		// 2) Create an array of String called names that contain: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
  
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
	
		// a) Use a loop to iterate through the array and calculate the average number of letters per name.
		int sumTing = 0;
		for(int i = 0; i < names.length; i++) {
			int lenName = names[i].length();
			sumTing += lenName;
		}
		System.out.println((double)sum / names.length);
		// b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces.
		
		String allNames = "";
		for(int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
		// 3) How do you access the last element of any array?
		 
			//To access the last element of any array, you can use the code arr[name.length - 1]
			 
		// 4) How do you access the first element of any array?
		 
			//To access the first element of any array, you can use arr[0]
			 
		// 5) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the new array.
		
		int[] nameLengths = new int[6];
		
		for(int i = 0; i < names.length; i++){
			nameLengths[i] = names[i].length();
			System.out.println("nameLength[" + i + "] = " + nameLengths[i]);
		}
		
		// 6) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array
		int totalSum = 0;
		for(int num : nameLengths) {
			totalSum += num;
		}
		System.out.println(totalSum);
		
	}
	
	
	// 7) Write a method that takes a String, word, and an int,n , as arguments and returns the word concatenated to itself n number of times
	
	public static String problem(String word, int n) {
		String longString = "";
		for(int i = 0; i < n; i++) {
			longString += word;
		}
		System.out.println(longString);
		return longString;
	}

	
	// 8) Write a method that takes two String, firstName and lastName, and returns a full name
	
	public static String fullName(String firstName, String lastName) {
		String myName = firstName + " " + lastName;
		return myName;
	}

	
	// 9) Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
	
	public static boolean bigSum(int[] numbers) {
		int totalSumTwo = 0;
		boolean itTrue = true;
		for(int i = 0; i < numbers.length; i++) {
			totalSumTwo += numbers[i];
			}
				if(totalSumTwo < 100) {
						itTrue = false;;
				}
				
		return itTrue;
	}

	
	//10) Write a method that takes an array of double and returns the average of all elements in the array
	
	public static double meElements(double[] numbers) {
		double theSum = 0;
		for(int i = 0; i < numbers.length; i++) {
			theSum += numbers[i];
		}
		double arrAve = theSum / numbers.length;
		return arrAve;
		
	}

	
	//11) Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array
	
	public static boolean isItGreater(double[] a, double[] b) {
		double sumA = 0;
		double sumB = 0;
		boolean isTrue = true;
		for(int i = 0; i < a.length; i++) {
			sumA += a[i];
		}
		for(int i = 0; i < b.length; i++) {
			sumB += b[i];
		}
		double aveA = sumA / a.length;
		double aveB = sumB / b.length;
		if(aveB > aveA) {
			isTrue = false;
		} 
		System.out.println("AveA = " + aveA);
		System.out.println("AveB = " + aveB);
		return isTrue;
			
	}

	
	//12) Write a method called willBuyDrink that takes a boolean isHotOutside and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean isTrue = false;
		if(isHotOutside == true && moneyInPocket > 10.50) {
			isTrue = true;
		}
		return isTrue;
	}

	
	//13)Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	public static boolean canIBuyIt(double bankAccount, double costOfItem) {
		boolean isTrue = false;
		if(bankAccount > costOfItem) {
			isTrue = true;
		}
		return isTrue;		
		}
*/
	
}
	
	
	

