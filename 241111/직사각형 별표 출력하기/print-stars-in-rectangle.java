import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}