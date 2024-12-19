package day3;

public class IncrementOperator {

	public static void main(String[] args) {
		
		//case1
		/*int a=10;
		System.out.println(a);
		a++;       //a=a+1;
		System.out.println(a);*/
		
		//case 2-post increment
		/*int a=10;
		int res = a++;// first assignment then increment
		System.out.println(res);  //10
		System.out.println(a); */  //11
		
		
		//case 3-pre increment
		int a=10;
		int res=++a;//first increment then assignment
		System.out.println(res);//11
		System.out.println(a); //11
		
		

	}

}
