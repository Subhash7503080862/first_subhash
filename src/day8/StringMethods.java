package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		//String s="Welcome";
		//String s= new String("Welcome"); 
		//System.out.println(s);
		
		//length()=return length of a string(no of characters)
		
		String s="welcome";
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concat()=joining strings
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		System.out.println("welcome".concat("to java".concat("automation")));
		
		//trim()=remove spaces right and left side
		s="   welcome   ";
		System.out.println("before triming:"+s.length());//before triming
		System.out.println(s);
		
		System.out.println("after triming:"+s.trim().length());
	   
		//chat()=return a character from a string based on index
		s="welcome";
		System.out.println(s.charAt(3));//c
		System.out.println(s.charAt(0));//w
		
		//contains()= returns true/false
		
		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("Wel"));//false
		System.out.println(s.contains("welme"));//false
		
		//equals(),equalsIgnorecase()=compare strings
		
		s1="welcome";
		s2="welcome";
		System.out.println("**************************");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		
		//replace()=replace single/multiple(sequence) of charaters in a string
		
		s="welcome to selenium java selenium to python selenium c#";
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.replace("selenium", "playwrite"));
		
		//substring()=extract substring from main string
	 s="selenium";
	 System.out.println(s.substring(1, 5));//elen
	 System.out.println(s.substring(0, 3));
	 
	 //toUppercase(), toLowercase()=
	 s="welcome";
	 System.out.println(s.toUpperCase());//WELCOME
	 System.out.println(s.toLowerCase());//welcome
	 
	 //split()=split the string into multiple parts based on delimeter
	 
	 s="abc@gmail.com";
	String a[]= s.split("@");
	System.out.println(Arrays.toString(a));
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	//ex=1
	String amount="$15,20,55";//152055
	System.out.println(amount.replace("$", ""));
	System.out.println(amount.replace("$", "").replace(",", ""));
	
	//ex=2
	// % * ^  & ( )-you can not use as a delimeter.
	s="abc,123@xyz";
	String arr[]=s.split(",");
	System.out.println(Arrays.toString(arr));
	String arr2[]=arr[1].split("@");
	System.out.println(Arrays.toString(arr2));
	
	 
	}
	

}
