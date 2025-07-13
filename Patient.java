class Patient{
    double computeBMI(String name, double height, double width){
        return width/(height*height);
    }
    public static void main (String args []){
        Patient p =new Patient();
        System.out.print(p.computeBMI("anand",1.75,69));
    }
}