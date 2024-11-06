import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int cnt=0;

        for(int i=0; i<n; i++) {
            if(n%2 ==1 || n%3 == 0) {
                cnt += i;
            }
            System.out.println(cnt);
        }
    }
}