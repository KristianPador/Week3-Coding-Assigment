
public class question2 {

	public static void main(String[] args) {
		// 2) Create an array of String called names that contain: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
		  
			String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
	
		// a) Use a loop to iterate through the array and calculate the average number of letters per name.
			int sum = 0;
			for(int i = 0; i < names.length; i++) {
				int lenName = names[i].length();
				sum += lenName;
			}
			System.out.println((double)sum / names.length);
			
		// b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces.
		
			String allNames = "";
			for(int i = 0; i < names.length; i++) {
				allNames += names[i] + " ";
			}
			System.out.println(allNames);

	}

}
