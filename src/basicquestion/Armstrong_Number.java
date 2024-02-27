package basicquestion;

public class Armstrong_Number {
	
	public static void check_Amstrong(int low, int high) {
		
		for (int i = low; i<= high; i++ ) {
			
			
			int num = i;
			int count = 0;
			while(num != 0) {
				num = num/10;
				count++;
			}
			
			int sum = 0;
			num = i;
			while(num != 0) {
				int d = num%10;
				sum = (int) (sum+ Math.pow(d, count));
				num = num/10;
			}
			
			if(sum == i) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low = 100;
		int high = 400;
		
		check_Amstrong(low, high);
		
	}
}
