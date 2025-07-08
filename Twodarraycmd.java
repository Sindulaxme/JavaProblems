class Twodarraycmd{
    public static void main (String []args){
        int ar[][]=new int[2][2];
               if(args.length<4){
                System.out.println("Enter 4 digit number");
            }
            else{
            for(int i=0; i<args.length; i++){
            {
                    ar[i/2][i%2]=Integer.parseInt(args[i]);
            }
            }
            System.out.println("The given array");
              for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                   System.out.print(ar[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("The reversed array");
               for(int i=1; i>=0; i--){
                for(int j=1; j>=0; j--){
                   System.out.print(ar[i][j]+ " ");
                }
                System.out.println();
            }
            }
    }
}