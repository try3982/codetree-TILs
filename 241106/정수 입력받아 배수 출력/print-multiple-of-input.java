import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n; i<= 5 *n; i +=n) {
             System.out.print(i + " ");
        }
    }
}