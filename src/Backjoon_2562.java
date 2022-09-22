import java.util.Scanner;

public class Backjoon_2562 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int[] num=new int[9];
        int max=0,count=0;

        for(int i=0;i<9;i++){
            num[i]=sc.nextInt();
            if(num[i]>max) {
                max=num[i];
                count=i;
            }
        }
        System.out.println(max+" "+(count+1));
        sc.close();
    }
}
