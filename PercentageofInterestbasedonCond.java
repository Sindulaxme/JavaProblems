import java.util.*;
class PercentageofInterestbasedonCond{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String gender =sc.next();
         int age=sc.nextInt();
         if(age>=1 && age<=58){
            if(gender.equals("Female"))
            System.out.println("8.2%");
            else
            System.out.println("8.4%");
         }
         else if(age>58 && age<=100){
            if(gender.equals("Female"))
            System.out.println("9.2%");
            else
            System.out.println("10.5%");
         }
    }
}