package patternquestion;

public class RightTriangle {
	
	public static void righttriangle(int num) {
		for(int i =1; i<=num; i++) {
			for (int j =1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		righttriangle(num);

	}

}
