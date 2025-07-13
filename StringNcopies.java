import java.util.*;
class StringNcopies{
    String s2=new String();
     String newString(String s){
        int n=s.length();
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
              s2=s2+s.charAt(j);
            }
        }
        return s2;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        StringNcopies sob = new StringNcopies();
        System.out.println(sob.newString(s1));
    }
}