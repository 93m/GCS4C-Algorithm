package chap06;
//청학동 과제 문제5번
public class project5 {
	public static void main(String[] args) {
		int num=5, sum=0, term=0;
		Loop1: while(true){	
			do {
				sum=sum+num;
				if(sum<=80) {
					num++;
				} else {
					break Loop1;
				}
			}while(num<=7);
			do{	
				sum=sum+num;
				if(sum<=80) {
					num=num-2;
					if(num>=3) {
						term++;
					} else {
						continue Loop1;
					}
				} else {
					break Loop1;
				}
			}while((term/5)!=5);
			num=4;
		}
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		System.out.println("term : " + term);
		System.exit(0);
	}
}
