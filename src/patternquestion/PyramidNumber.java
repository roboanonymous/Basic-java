package patternquestion;

public class PyramidNumber {
	
	
public static void PyramidNumber(int num) {
		
		for(int i =0; i<num; i++) {
			
			for (int j = num-i; j>0; j--) {
				System.out.print("  ");
			}
			
			for (int k = 0 ; k<= i; k++) {
				int ans = i+1+k;
				System.out.print(ans +" ");
			}
			
			for (int k = 0 ; k<= i-1; k++) {
				int ans = (2*i)-k;
				System.out.print(ans +" ");
			}
			 
			 
			System.out.println();
		}
		
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		PyramidNumber(num);

	}

}
