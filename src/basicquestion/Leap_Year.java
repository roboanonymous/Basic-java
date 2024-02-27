package basicquestion;

public class Leap_Year {
	
	public static Boolean checkleap(int year) {
		if( year% 4 == 0) {
			if(year%100 == 0 && year%400 != 0) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2400;
		
		System.out.println(checkleap(year));
		
	}

}
