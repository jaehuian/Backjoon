import java.util.Scanner;

public class Backjoon_4344 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt(), student_count;
        double avg=0,percent=0;

        for(int i=0;i<testcase;i++){
            student_count=sc.nextInt();

            int[] grade_arr=new int[student_count];
            avg=0;
            percent=0;
            
            for(int j=0;j<student_count;j++){
                grade_arr[j]=sc.nextInt();
                avg+=grade_arr[j];
            }
            for(int j=0;j<student_count;j++){
                if(grade_arr[j]>(avg/student_count)) percent++;
            }
            System.out.println(String.format("%.3f",(percent/student_count)*100)+"%");
        }
    }
}
