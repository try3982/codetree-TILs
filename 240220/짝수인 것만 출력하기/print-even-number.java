import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();


        int[] arr = new int[100];
        int[] newArr = new int[100];
        int cnt = 0;


        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
            if(arr[i] % 2 == 0)
        	    newArr[cnt++] = arr[i];

        for(int i = 0; i < cnt; i++)
            System.out.print(newArr[i] + " ");
    }
}