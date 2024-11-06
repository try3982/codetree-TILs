import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int max =0;
       int min=0;
       int sum=0;


       if(a > b ) {
         max =a;
         min = b;
       }else {
        max = b;
        min =a;
       }
       
       for(int i=min; i <=max; i++) {
         if(min %5 ==0) {
            sum++;
         }
       }
       System.out.println(sum);
    }
}