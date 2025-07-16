import java.util.*;
class EncodedTwoString2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n1=s1.length();
        int n2=s2.length();
        String p1="",p2="",p3="";
        String pp1="",pp2="",pp3="";
                   int x=n1/3;
             for(int i=x; i<n1-x; i++){
                p2=p2+s1.charAt(i);
            }
                   int x1=n2/3;
            for(int i=0; i<x1; i++){
                pp1=pp1+s2.charAt(i);
            }
             for(int i=x1; i<n2-x1; i++){
                pp2=pp2+s2.charAt(i);
            }
       
        String password = p2+pp2+pp1;
        System.out.println(password);
    }
}