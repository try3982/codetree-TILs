import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum =0;

        for(int i = a; i<=b; i++) {
            sum +=i;
        }
        System.out.print(sum);


    }
}