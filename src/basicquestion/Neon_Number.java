package basicquestion;

public class Neon_Number {
	
    public static void check_Neon(int low, int high) {
		
		for (int i = low; i<= high; i++ ) {
			
			
			int square = i*i;
			int sum = 0;
			while(square != 0) {
				int d = square%10;
				sum = sum+d;
				square = square/10;
			}
			
			if(sum == i) {
				System.out.print(i + " ");
			}
		}
	}
	

	public static void main(String[] args) {
		
		int low = 1;
		int high = 400;
		
		check_Neon(low, high);

	}

}
