import java.util.*;
class InitializeDataType{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        char c=sc.next().charAt(0);
        if(c>=65 && c<91 || c>=97 && c<123){
            System.out.println("Alphabet");
        }
        else if(c-'0'>=0 && c-'0'<=9){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}