package day6;

public class SingleDimArray {

	public static void main(String[] args) {
		
		//decleare of an array
		//approach-1
		/*int a[]= new int[5];
		//assignment the value
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//approach-2
		int a[]= {100, 200, 300, 400, 500};
		
		//size of the array
		
		System.out.println("length of the array :"+a.length);
		System.out.println(a[4]);//500
		
		//reading all the values from array
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		//for-each loop
		for(int x:a) {
			System.out.println(x);
			
		}
		

	}

}
