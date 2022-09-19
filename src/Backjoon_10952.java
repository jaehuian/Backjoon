import java.util.Scanner;

public class Backjoon_10952 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a,b;
        for(;;){
            a=sc.nextInt();
            b=sc.nextInt();

            if(a==0&&b==0) break;
            System.out.println(a+b);
        }
        sc.close();
    }
}
