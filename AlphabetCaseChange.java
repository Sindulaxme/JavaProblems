import java.util.*;
class AlphabetCaseChange{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        char c=sc.next().charAt(0);
        int a=0;
        if(c>=65 && c<91)
           a=c+32;
        else if(c>=97 && c<113)
           a=c-32;
        System.out.println((char)a);
    }
}