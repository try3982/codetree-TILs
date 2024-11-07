import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // for(int i=1; i<=n; n--) {
        //     for(int j=n; j >=1; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.print(" ");

        for(int i=n; i >=1; i--) {
            for(int j=1; j<=i; j++) {
                for(int k = 1; k<=i; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
             System.out.println();
        }
       
        }
        
    }