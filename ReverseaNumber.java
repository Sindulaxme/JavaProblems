import java.util.*;
class ReverseaNumber{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x>0){
            int r=x%10;
            sum=sum*10+r;
            x/=10;
        }
        System.out.println(sum);
    }
}