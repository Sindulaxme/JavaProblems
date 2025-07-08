import java.util.*;
class SwitchCaseColour{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String code=sc.next();
        String colour="";
        switch(code){
            case "R":
                colour="Red";
                break;
            case "B":
                colour="Blue";
                break;  
            case "G":
                colour="Green";
                break; 
            case "O":
                colour="Orange";
                break;  
            case "Y":
                colour="Yellow";
                break;  
            case "W":
                colour="White";
                break;   
            default:
                 colour="Invalid";    
        }
        System.out.println(colour);
    }
}