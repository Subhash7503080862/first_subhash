package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
		//decleare of an array
		//approach-1
		
		//int a[][]= new int [3][2];
		
		//assignment the value
		
		/*a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		*/
		//approach-2
		
		int a[][]= {{100,200},
				    {300,400},
				    {500,600}
				   };
		//size of the array
		System.out.println("length of row:"+a.length);
		System.out.println("length of the column:"+a[0].length);
	//how to read single value
		System.out.println(a[0][0]);//100
		
		//How to read multiple data
		for (int row = 0; row < a.length; row++) {
			
			  for (int col = 0; col < a[0].length; col++)
			  {
				  System.out.print(a[row][col]+"  ");
				
			}
			  System.out.println();
			 
			
			
		}

	}

}
