import java.util.Scanner;

public class Backjoon_14681 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();

        if(x>0&&y>0)
        System.out.println("1");
        else if(x<0&&y>0)
        System.out.println("2");
        else if(x<0&&y<0)
        System.out.println("3");
        else if(x>0&&y<0)
        System.out.println("4");

        sc.close();
    }
}
