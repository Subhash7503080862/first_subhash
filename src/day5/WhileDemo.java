package day5;

public class WhileDemo {

	public static void main(String[] args) {
		
		/*int i=1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}*/
		
		/*int i=10;
		while (i>=1) {
			System.out.println(i);
			i--;
		}*/
		
		int i=1;
		while (i<=10) {
			if (i%2==0) {
				
				System.out.println("even number");
				
			}
			else {
				System.out.println("odd number");
			}
			i++;
		}

	}

}
