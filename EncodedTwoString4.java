import java.util.*;
class EncodedTwoString4{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n1=s1.length();
        int n2=s2.length();
        String p1="",p2="",p3="";
        String pp1="",pp2="",pp3="";
        if(n1%3==0){
                int x=n1/3;
            for(int i=0; i<x; i++){
                p1=p1+s1.charAt(i);
            }
             for(int i=x; i<n1-x; i++){
                p2=p2+s1.charAt(i);
            }
            for(int i=n1-x; i<n1; i++){
                 p3=p3+s1.charAt(i);
            }
        }
        else{
           int a=n1%3;
            int b=n1/3;
            int x=a==b?a+1:a>b?a:b;
            for(int i=0; i<x; i++){
                p1=p1+s1.charAt(i);
            }
             for(int i=x; i<n1-x; i++){
                p2=p2+s1.charAt(i);
            }
            for(int i=n1-x; i<n1; i++){
                 p3=p3+s1.charAt(i);
            }

        }
         if(n2%3==0){
                int x=n2/3;
            for(int i=0; i<x; i++){
                pp1=pp1+s2.charAt(i);
            }
             for(int i=x; i<n2-x; i++){
                pp2=pp2+s2.charAt(i);
            }
            for(int i=n2-x; i<n2; i++){
                 pp3=pp3+s2.charAt(i);
            }
        }
        else{
            int a=n2%3;
            int b=n2/3;
           int x=a==b?a+1:a>b?a:b;
            for(int i=0; i<x; i++){
                pp1=pp1+s2.charAt(i);
            }
             for(int i=x; i<n2-x; i++){
                pp2=pp2+s2.charAt(i);
            }
            for(int i=n2-x; i<n2; i++){
                 pp3=pp3+s2.charAt(i);
            }

        }
           
    //   System.out.println(p1+" "+p2+" "+p3);
    //    System.out.println(pp1+" "+pp2+" "+pp3);
        String password = pp3+p2+pp2+p1;
        System.out.println(password);
    }
}