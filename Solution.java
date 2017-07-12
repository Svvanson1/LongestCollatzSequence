
public class Solution {

	static int counter;
	
	public static void main(String[] args) {
		
		long biggestNum = 0;
		long biggestIndex = 0;
		long c;
		
		for(int i = 0; i <= 1000000; i++) {
			c = collat(i);
			if(c > biggestNum) {
				biggestNum = c;
				biggestIndex = i;
			}
		}
		
		System.out.println(biggestIndex);
		
		
	}

	
	public static int collat(long n) {
		
		int count = 1;
		
		while(n > 1) {
			count += 1;
		if(n % 2 == 0) {
			n = n/2;
		}
		else{
			n = 3*n + 1;
			}
		}
		
		return count;
		
	}
}
