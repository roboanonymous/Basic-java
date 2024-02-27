package patternquestion;

public class ReversePyramid {
	
	public static void reversepyramid(int num) {
		
		for(int i =0; i<=num; i++) {
			
			for (int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1 ; k<= 2*(num -i)-1; k++) {
				System.out.print("*");
			}
			
			 
			 
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		reversepyramid(num);

	}

}
