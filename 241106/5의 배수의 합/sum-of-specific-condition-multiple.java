import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int sum=0;
       
       for(int i=a; i <=b; i++) {
         if(a %5 ==0) {
            sum++;
         }
       }
       System.out.println(sum);
    }
}