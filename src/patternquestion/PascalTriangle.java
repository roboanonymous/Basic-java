package patternquestion;

public class PascalTriangle {
	
	public static int factorial(int a)
    {
        if (a == 0)
            return 1;
 
        return a * factorial(a - 1);
    }
	
    public static void PascalTriangle (int num) {
		
		for(int i =0; i<num; i++) {
			
			for (int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			
			
			
			for (int k = 0 ; k<= i; k++) {
				
				int res = factorial(i)
                        / (factorial(i - k)
                                * factorial(k));
				System.out.print(res + " ");
	            }
			
				 
			 
			System.out.println();
		}
		
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		PascalTriangle(num);

	}
	

}
