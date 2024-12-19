package day9;

public class StringbufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String-Immutable
		/*String s="welcome";
		s.concat("to java");
		System.out.println(s);
*/
		//StringBuffer-mutable
		
		StringBuffer s= new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s);
		
		//StringBuilder=mutable
		
		
		StringBuilder s1= new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s1);
	}

}
