import java.util.*;
class StringPalin{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int n=s.length();
        char [] reverse=new char[n];
        char [] c=s.toCharArray();
        int j=0;
        for(int i=n-1; i>=0; i--){
              reverse[j++]=c[i];
        }
        String r = new String(reverse);
        if(s.equals(r)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}