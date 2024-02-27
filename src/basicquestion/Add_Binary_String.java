package basicquestion;

public class Add_Binary_String {
	
	public static String binaryadd1(String x, String y) {
		
		int l1 = x.length()-1;
		int l2 = y.length()-1;
		int carry =0;
		StringBuilder ans = new StringBuilder();
		
		while(l1>=0 || l2>=0) {
			int sum = carry;
			if(l1>=0) {
				sum = sum + (x.charAt(l1)-'0');
			}
			
			if(l2>=0) {
				sum = sum + (y.charAt(l2)-'0');
			}
			
			if(sum == 0 || sum == 1) {
				ans.append(sum);
				carry =0;
			}
			
			else if(sum == 2) {
				ans.append("0");
				carry = 1;
			}
			
			else {
				ans.append("1");
				carry = 1;
			}
			
			l1--;
			l2--;
		}
		
		if (carry == 1) {
			ans.append("1");
		}
		return ans.reverse().toString();
		
	}

	public static void main(String[] args) {
		
		String x = "101";
		String y = "101";
		
		System.out.println(binaryadd1(x, y));

	}

}
