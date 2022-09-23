import java.util.Scanner;

public class Backjoon_2480 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max=0;

        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();

            if(max<arr[i]) max=arr[i];
        }
        if(arr[0]==arr[1]){
            if(arr[1]==arr[2]) System.out.println(10000+arr[0]*1000);
            else System.out.println(1000+arr[0]*100);
        }
        else if(arr[0]==arr[2]) System.out.println(1000+arr[0]*100);
        else if(arr[1]==arr[2]) System.out.println(1000+arr[1]*100);
        else System.out.println(100*max);

        sc.close();
    }
}
