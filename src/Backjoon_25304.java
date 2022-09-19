import java.util.Scanner;

public class Backjoon_25304 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt(),count=sc.nextInt();

        for(int i=0;i<count;i++){
            sum -= sc.nextInt()*sc.nextInt();
        }
        if(sum!=0) System.out.println("No");
        else System.out.println("Yes");

        sc.close();
    }
}
