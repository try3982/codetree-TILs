import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

          System.out.print(a / b + ".");
        
        // a를 b로 나눈 나머지를 시작으로
        // 소수점 자리를 하나씩 계산합니다.
        a %= b;
        for(int i = 0; i < 20; i++) {
            // 나머지에 10 곱한 값을 기준으로
            // b로 나누었을 떄의 몫을 구해줍니다.
            a *= 10;
            System.out.print(a / b);
            
            // a를 b로 나눈 나머지를 게속 갱신해줍니다.
            a %= b;
        }

    }
}