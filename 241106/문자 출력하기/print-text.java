import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
         char c = in.next().charAt(0);
         for(int i=0; i<8; i++){
            System.out.print(c);
         }
     }
}