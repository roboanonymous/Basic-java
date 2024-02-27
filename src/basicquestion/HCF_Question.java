package basicquestion;

public class HCF_Question {
	
    public static void findhcf(int num1, int num2) {
		
		int ans = Math.min(num1, num2);
		
		 while (ans > 0) {
	            if ( num1 % ans == 0 && num2 % ans == 0)
	                break;
	            ans--;
	        }
		 System.out.println(ans);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 36;
		int num2 = 60;
		
		findhcf(num1, num2);
	}


}
