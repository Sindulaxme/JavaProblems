import java.util.*;
class EncodedTwoString1{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n1=s1.length();
        int n2=s2.length();
        String p1="",p2="",p3="";
        String pp1="",pp2="",pp3="";
                   int x=n1/3;
            for(int i=0; i<x; i++){
                p1=p1+s1.charAt(i);
            }
            for(int i=n1-x; i<n1; i++){
                 p3=p3+s1.charAt(i);
            }
             
                   int x1=n2/3;
            for(int i=0; i<x1; i++){
                pp1=pp1+s2.charAt(i);
            }
            for(int i=n2-x1; i<n2; i++){
                 pp3=pp3+s2.charAt(i);
            }
        String password = pp1+p1+p3+pp3;
        System.out.println(password);
    }
}