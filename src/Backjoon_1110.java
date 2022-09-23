import java.util.Scanner;

public class Backjoon_1110 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int result=-1, num=sc.nextInt(),num2=num,count=0;

        for(;result!=num;count++){
            result=(num2%10*10)+(num2/10+num2%10)%10;
            num2=result;
        }
        System.out.println(count);

        sc.close();
    }
}
