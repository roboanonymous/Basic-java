package basicquestion;

public class Prime_Number {
	
	public static void check_prime (int low, int high) {
		
       for (int i = low; i<= high; i++ ) {
			int flag =1;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					flag = 0;
					break;
				}
			}
			
			if(flag == 1)
			{
				System.out.print(i + " ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low = 100;
		int high = 400;
		
		check_prime(low, high);
	}

}
