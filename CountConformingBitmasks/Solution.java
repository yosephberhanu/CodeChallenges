class Solution { 
	public int solution(int a, int b, int c){
		int returnValue = (count(a) + count(b) + count(c));
		returnValue += (count(a | b | c) - (count(a | b) +  count(a | c) + count(b | c)));
		return returnValue;
	}
	public int count(int n){
		return 1 << (30 - Integer.bitCount(n));
	}
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.printf("%d \n", s.solution(1073741727, 1073741631, 1073741679));		
	}
}