import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
	    int n = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        int cnt = 1;

         
        while(true) {
            cnt++;
            arr[cnt] = arr[cnt - 1] + arr[cnt - 2];
            if(arr[cnt] > 100)
                break;
        }

         
        for(int i = 0; i <= cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}