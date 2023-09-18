class Solution { 
	public int solution(int n){
		String inBinary = toBinary(n);
		int returnValue = 0;
		int currentLength = 0;
		boolean flag = false;
		for(char c: inBinary.toCharArray()){
			if(c == '1'){
				if(flag){
					returnValue = returnValue < currentLength? currentLength:returnValue;
					currentLength = 0;
				}else {
					flag = true;
				}
			}else if (flag){
				currentLength++;
			}
		}
		return returnValue;
	}
	public String toBinary(int n){
		String returnValue = "";
		while( n > 0){
			returnValue = (n % 2) + returnValue ;
			n = n/2;
		}
		return returnValue;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {9, 529, 4041, 32, 0b10010000001};
		// int[] check = {0b1001, 0b1000010001,0b10000010001,0b100000};
		for(int n:nums){
			System.out.printf("%d => %s => %d \n", n, s.toBinary(n),  s.solution(n));
		}
		// for(int i = 0; i < nums.length; i++){
		// 	int n = nums[i];
		// 	int c = check[i];
		// 	System.out.printf("%d => %s (%d) => %d \n", n, s.toBinary(n),c,  s.solution(n));
		// }
		
		
	}
}