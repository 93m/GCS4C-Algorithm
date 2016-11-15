class Task2{
	public static void main(String[] args){
		int[] SU = {8, 7, 1, 4, 2};
		int key, J = 0, i = 1;
		while(i < 5){
			key = SU[i];
			J = i - 1;
			while(J >= 0){
				if( key < SU[J]){
				SU[J+1] = SU[J];
				J--;
				}else {
					break;
				}
				
			}
			SU[J+1] = key;
			i++;
		}
		for(int num = 0; num<5; num++)
		System.out.print(SU[num]+" ");
	}
}