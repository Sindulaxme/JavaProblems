class Persons{
    String name;
    String dateofbith;
    Persons(String name, String dateofbith){
        this.name=name;
        this.dateofbith=dateofbith;
         System.out.println("Name: "+name+" Date of Birth "+dateofbith);
    }
}
class Teacher extends Persons{
    double salary;
    String subject;
    Teacher(String name, String dateofbith, double salary, String subject){
        super(name,dateofbith);
        this.salary=salary;
        this.subject=subject;
         System.out.println("Salary: "+salary+" subject "+subject);
    }
}
class Student extends Persons{
    String stuId;
     Student(String name, String dateofbith, String stuId){
        super(name,dateofbith);
        this.stuId=stuId;
      System.out.println("Student Id "+stuId);
    }
}
class CollegeStudent extends Student{
    String collegename;
    int year;
       CollegeStudent(String name, String dateofbith, String stuId, String collegename, int year){
        super(name,dateofbith,stuId);
       this.collegename=collegename;
       this.year=year;
    System.out.println("College Name: "+collegename+" year "+ year);
    }
}
class SchoolApplication{
    public static void main (String args[]){
        System.out.println("Teacher");
        Teacher t = new Teacher ("Janu","26/6/1996",35000,"Maths");
           System.out.println("Student");
        Student s = new Student("Sameer","10/5/2009","2022cs20");
           System.out.println("College Student");
        CollegeStudent cs = new CollegeStudent("Rishab","7/8/2006","2029as8","KVC",3);
    }
}