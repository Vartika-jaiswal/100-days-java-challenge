/* star pattern 7
* * * * *
 * * * *
  * * *
   * *
    *
star pattern 7*/
import java.util.Scanner;
class star_pattern7 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<=n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(" ");
      }for(int k=n;k>=i;k--){
        System.out.print(" *");
      }System.out.println();
   }sc.close();
    
  }
}
