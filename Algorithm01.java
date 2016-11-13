package algorithm; 
public class Algorithm01 {
	public static void main(String args[]) {
		int i =0 , sum=0, total, j = 0;
		for(i=1; i<51; i++)
		{
			 i = i +1;
             j = i % 6;		
             if(j==0) {
            	 sum +=i;
             }
		}
		System.out.println(sum);
		
	}

}
