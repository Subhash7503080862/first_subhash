package day9;

public class StringComparision {

	public static void main(String[] args) {
		
		//case 1
		/*String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
*/
		String s1= new String("welcome");
		String s2= new String("welcome");
		
		System.out.println(s1==s2);//to compare the objects
		System.out.println(s1.equals(s2));//to compare the values of objects
	}

}
