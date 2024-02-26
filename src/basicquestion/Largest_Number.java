package basicquestion;

public class Largest_Number {
	
	
	public static void lasgestnumber(int x,int y,int z) {
		int max = x;
		
		if(y> x) {
			max = y;
		}
		else {
			max = x;
		}
		
		if(max < z) {
			max = z;
		}
		
		System.out.println(max);
	}
	
	public static void lasgestnumber2(int x,int y,int z) {
		int max = z > (x > y ? x : y) ? z : ((x > y) ? x : y);
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		
		int x = 12;
		int y = 13;
		int z = 24;
		
		lasgestnumber(x,y,z);
		lasgestnumber2(x,y,z);

	}

}
