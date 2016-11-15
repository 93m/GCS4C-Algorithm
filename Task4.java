class Task4 {
	public static void main(String[] args){
		int sum=0, K = 0, R = 0, N = 0, LM = 0;
		
		for(N = 4; N<=7; N++){
			sum=0;
			K = N/2;
			for( int J = 1; J <= K; J++){
				R = N%J;
				if(R == 0){
					sum += J;
				}
			}
			if( N == sum){
				System.out.println("N = "+N);
				LM += 1;
			}
			
		}
		System.out.println("LM = "+LM);
	}
}