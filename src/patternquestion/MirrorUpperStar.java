package patternquestion;

public class MirrorUpperStar {
	
    public static void MirrorUpperStar(int num) {
		
		for(int i =0; i<num; i++) {
			
			for (int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0 ; k<= i; k++) {
				System.out.print(" *");
			}
			
			 
			 
			System.out.println();
		}
		
          for(int a =0; a<num-1; a++) {
			
			for (int b = -1; b<a+1; b++) {
				System.out.print(" ");
			}
			
			for (int c= num-2-a ; c>=0 ; c--) {
				System.out.print(" *");
			}
			
			 
			 
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		MirrorUpperStar(num);

	}

}
