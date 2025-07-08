class Firstfivevalue{
    public static void main(String [] args){
        int x=5;
        int i=1;
       while(x>0){
               if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(i);
                x--;
               }
               i++;
       }
        }
    }