import java.util.*;
class StringWithoutFirstandlast{
     void newString(String s){
        int n=s.length();
            for(int j=1; j<n-1; j++){
                System.out.print(s.charAt(j));
            }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
       StringWithoutFirstandlast sob = new StringWithoutFirstandlast();
        sob.newString(s1);
    }
}