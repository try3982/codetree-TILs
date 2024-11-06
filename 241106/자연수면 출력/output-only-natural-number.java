import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a > 0) {
            for(int i=0; i<b; i++) {
                System.out.print(a);
            }
        }else {
            System.out.print(0);
        }
    }
}