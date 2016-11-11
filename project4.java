package chap06;
//청학동 과제 문제4번
public class project4 {
	public static void main(String[] args) {
		int LM=0, SUM=0, K=0, R=0, N=4, J=0;
		for(N=4; N<=7; N++) {
			SUM=0;
			K=(int)(N/2);
			for(J=1; J<=K; J++) {
				R=(N%J);
				if(R==0) {
					SUM=SUM+J;
				}
			}
			if(N==SUM) {
				System.out.println("N : " + N);
				LM = LM + 1;
			}
		}
		System.out.println("LM : " +LM);
		System.exit(0);
	}
}
