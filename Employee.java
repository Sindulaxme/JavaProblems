class Employee extends Person{
    double salary;
    String year;
    String nationalinsnum;
    Employee(String name,double salary, String year, String nationalinsnum){
        super(name);
        this.salary = salary;
        this.year=year;
        this.nationalinsnum=nationalinsnum;
        setdetails();
    }
    void getdetails(){
       //super.getdetails(name);
         this.salary = salary;
        this.year=year;
        this.nationalinsnum=nationalinsnum;
          
    }
    void setdetails(){
        super.setdetails();
         System.out.println("salary " + salary+" year "+year+ " national insurance number "+ nationalinsnum);
    }
}