import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int i=3;
        int n = in.nextInt();
        while(i <=n) {
            System.out.print(i +" ");
            i +=3;
        }
    }
}