package algorithm;
public class Algorithm02{
		public static void main(String[] args){
			int[] su = {8, 7, 1, 4, 2};
			int key, j = 0, i = 1;
			for(i =1; i<5; i++){
				key = su[i];
				j = i - 1;
				for(j = i-1; j >= 0; j--){
					if( key < su[j]){
					su[j+1] = su[j];	
					}else {
						break;
					}
				}
				su[j+1] = key;
			}
			for(int sum = 0; sum<5; sum++)
			System.out.print(su[sum]+" ");
		} }
