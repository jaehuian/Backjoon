import java.util.Scanner;

public class Backjoon_10818 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt(),num=sc.nextInt(),min=num,max=num;

        for(int i=0;i<count-1;i++){
            num=sc.nextInt();
            if(num<min) min=num;
            if(num>max) max=num;
        }
        System.out.println(min+" "+max);
        sc.close();
    }
}
