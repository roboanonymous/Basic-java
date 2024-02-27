package patternquestion;

public class MirrorLowerStar {
	
public static void MirrorLowerStar(int num) {
	
	 
		
		for(int i =0; i<num; i++) {
			
			for (int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0 ; k<= i; k++) {
				System.out.print(" *");
			}
			
			 
			 
			System.out.println();
		}
		
         
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		MirrorLowerStar(num);

	}

}
