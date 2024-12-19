package day7;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,20,40,10,10};
		int count_value=20;
		
		int count=0;
		
		for (int x : a) {
			
			if (x==count_value) {
				
				count++;
				
				
			}
			
			
		}
		System.out.println("count of the value is:"+count);

	}

}
