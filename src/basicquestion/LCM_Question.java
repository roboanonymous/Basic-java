package basicquestion;

public class LCM_Question {
	
	public static void findlcm(int num1, int num2) {
		
		int ans = Math.min(num1, num2);
		
		 while (true) {
	            if (ans % num1 == 0 && ans % num2 == 0)
	                break;
	            ans++;
	        }
		 System.out.println(ans);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 15;
		int num2 = 24;
		
		findlcm(num1, num2);
	}

}
