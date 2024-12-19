package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//mutable-can change
		//Stringbuilder and stringbuffer are mutable object
		int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//mutable-we can change
		System.out.println(Arrays.toString(a));
		
		
		//immutable=we cannot change
		//string are immutable

		String s= new String("welcome");
		System.out.println(s);
		String concatstring = s.concat("to java");
		System.out.println(s);
		System.out.println(concatstring);

	}

}
