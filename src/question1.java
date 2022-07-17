
public class question1 {

	public static void main(String[] args) {
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


}
