import java.util.Scanner;

public class Backjoon_2525 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),m=sc.nextInt();
        int cook = sc.nextInt();
        int cook_h=cook/60+h, cook_m=cook%60+m;

        if(cook_m>=60){
            cook_h++;
            cook_m -=60;
        }

        System.out.println(((cook_h>=24)?cook_h-24:cook_h) + " " +cook_m);

        sc.close();
    }
}
