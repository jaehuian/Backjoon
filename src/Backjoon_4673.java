public class Backjoon_4673 {
 
	public static void main(String[] args) {
 
		boolean[] selfnum = new boolean[10000];	
 
		for (int i = 1; i < 10001; i++){
			int n = selfnum_f(i);
		
			if(n < 10001){	
				selfnum[n-1] = true;
			}
		}
    
		for (int i = 1; i < 10001; i++) {
			if (!selfnum[i-1]) {	
				System.out.println(i);
			}
		}
	}
 
	public static int selfnum_f(int num){
		int sum = num;
    
		while(num != 0){
			sum = sum + (num % 10);
			num = num/10;
		}
    
		return sum;
	}
}    
