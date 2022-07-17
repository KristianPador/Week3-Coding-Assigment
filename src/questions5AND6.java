
public class questions5AND6 {

	public static void main(String[] args) {
		
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
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

}
