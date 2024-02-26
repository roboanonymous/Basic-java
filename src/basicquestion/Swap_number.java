package basicquestion;

public class Swap_number {
	
	public static void swap1(int a, int b) {
		
		int temp = a;
		a= b;
		b = temp;
		
		System.out.println(a + "  "+ b);
	}
	
	
    public static void swap2(int a, int b) {
		
		b = a+b;
		a = b-a;
		b = b-a;
		
		System.out.println(a + "  "+ b);
	}
    
    public static void swap3(int a, int b) {
		
		a= a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a + "  "+ b);
	}
    
    
	public static void main(String[] args) {
		
		int a =3;
		int b = 5;
		
		System.out.println(a + "  "+ b);
		
		swap1(a,b);
		swap2(a,b);
		swap3(a,b);
		
	}

}
