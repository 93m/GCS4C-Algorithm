
public class GetDivisor {
	public static void main(String[] args) {
		int LM = 0, N = 0, J = 0, R = 0, SUM = 0, K = 0;
		for(N = 4; N < 8; N++) {
			SUM = 0;
			K = (int)(N/2);
			for(J = 1; J < K + 1; J++) {
				R = N % J;
				if(R == 0) {
					SUM = SUM + J;
				}
			}
			if(N == SUM) {
				System.out.println("N : " + N);
				LM = LM + 1;
			}
		}
		System.out.println("LM Count : " + LM);
	}
}
