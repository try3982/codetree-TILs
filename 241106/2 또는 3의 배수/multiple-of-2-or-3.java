import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++) {
           if(i %2 ==0) {
            System.out.print(1+" ");
           }else if(i%3==0){
            System.out.print(1+" ");
           }else{
            System.out.print(0+" ");
           }
    }
    }
}