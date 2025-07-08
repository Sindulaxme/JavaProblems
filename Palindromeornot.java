import java.util.*;
class Palindromeornot{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int x=n;
        int sum=0;
        while(x>0){
            int r=x%10;
            sum=sum*10+r;
            x/=10;
        }
        if(sum==n)
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");
    }
}