import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            a +=n;
            System.out.println(a);
       

        }
    }
}