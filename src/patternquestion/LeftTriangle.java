package patternquestion;

public class LeftTriangle {
	
	public static void lefttriangle(int num) {
		for(int i =0; i<=num; i++) {
			
			 for (int j = 2 * (num - i); j >= 0; j--) {
	            
	                System.out.print(" ");
	            }
			 
			 for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		lefttriangle(num);

	}

}
