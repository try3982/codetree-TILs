import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int val, sum;
          sum =0;
          for(int i=0; i<10; i++) {
            val = in.nextInt();
            sum += val;
          }
          System.out.print(sum);

    }
}