package JavaWeek3Day1;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
	
		int[] num= {2, 5, 7, 7, 5, 9, 2, 3};
		
		Arrays.sort(num);
		
		int lengthofArray =num.length;
		
		for (int i=0; i<lengthofArray-1; i++) {
			
		if (num[i] == num[i+1]) {
			System.out.println(num[i]);
		}
		
			
		}
		
		
	}

}
