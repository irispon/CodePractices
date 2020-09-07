
public class ExFibonacci {

	static long[] memory = new long[1000];

	
public static long ExF(int N) {
		memory[0]=0;
		memory[1]=1;

		if(N>=2) {
			memory[N] = memory[N-1]+memory[N-2];
			
		}
	 
		return memory[N];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int N =0; N<90; N++) {
			
			System.out.println(N+" "+ExF(N));
		}
		
	}

}
