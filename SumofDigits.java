import java.util.*;
class SumofDigits{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        for(int i=x; i>0; i/=10){
            int r=i%10;
            sum=sum+r;
        }
        System.out.println(sum);
    }
}