import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++) {
            arr[i] = in.nextInt();
            arr[i] *= arr[i];
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}