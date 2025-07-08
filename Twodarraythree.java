class Twodarraythree{
    public static void main (String args[]){
         int ar[][]=new int[3][3];
               if(args.length<9){
                System.out.println("Enter 9 digit number");
            }
            else{
            for(int i=0; i<args.length; i++){
                    ar[i/3][i%3]=Integer.parseInt(args[i]);
            }
            }
            int max=0;
             System.out.println("The given array");
              for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                   System.out.print(ar[i][j]+ " ");
                }
                System.out.println();
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(max<ar[i][j]){
                        max=ar[i][j];
                    }
                }
            }
            System.out.println("The Biggest number is : "+max);
       
    }
}