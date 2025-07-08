class Primeinrange{
    public static void main (String []args){
        for(int i=11; i<98; i++){
             if(isprime(i)){
                System.out.print(i+" ");
             }
        }
    }
     public static boolean isprime(int x){
            if(x<=1) return false;
            for(int i=2; i<=Math.sqrt(x); i++){
                if(x%i==0) return false;
            }
            return true;
        }
}