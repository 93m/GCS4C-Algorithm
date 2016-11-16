import java.util.Scanner;
public class Bublesort {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
  int bubsu[], temp = 0;
  bubsu = new int[10];
  System.out.println("숫자 10개를 입력하세요.");
  for(int i=0; i<bubsu.length;i++)
  bubsu[i] = scanner.nextInt();
  
  for(int i=0; i<bubsu.length; i++){
   for(int j = 0; j< (bubsu.length-1);j++){
    if(bubsu[j]>bubsu[j+1]){
     temp = bubsu[j];
     bubsu[j] = bubsu[j+1];
     bubsu[j+1] = temp;
     
    }
   }
  }
  
  
  for(int i = 0; i<bubsu.length;i++)
  System.out.print(bubsu[i] + "  ");
  

 }

} 
