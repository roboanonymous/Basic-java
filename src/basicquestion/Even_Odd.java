package basicquestion;

public class Even_Odd {
	
    public static void checkevenodd2(int x) {
		
		if((x|1) > x) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
	
	public static void checkevenodd(int x) {
		
		if(x%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}

	public static void main(String[] args) {
		
		int x = 12;
		int y = 13;
		
		checkevenodd(x);
		checkevenodd(y);
		
		checkevenodd2(x);
		checkevenodd2(y);
		
		

	}

}
