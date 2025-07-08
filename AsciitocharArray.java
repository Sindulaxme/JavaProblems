import java.util.*;
 class AsciitocharArray {
    public static void main (String [] args){
       Scanner ss=new Scanner(System.in);
       System.out.println("Enter array size");
       int n=ss.nextInt();
       int a[]= new int[n];
       System.out.println("Enter values:");
       for(int i=0; i<a.length; i++){
        a[i]=ss.nextInt();
       } 
       String s[]=new String[n];
       for(int i=0; i<a.length; i++){
            char c=(char)a[i];
            s[i]=String.valueOf(c);
       }
       System.out.println("Corresponding value is: ");
       for(int i=0; i<a.length; i++){
        System.out.print(s[i] + " ");
       }
    }
 }