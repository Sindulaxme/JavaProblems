abstract class Author{
    private String name;
    private String emailId;
    private char gender;
    Author(String name, String emailId, char gender){
        this.name=name;
        this.emailId=emailId;
        this.gender=gender;
    }
    protected String setter(){
        return name;
    }
     protected String setteremail(){
        return emailId;
    }
    protected char settergender(){
          return gender;
    }
    public abstract String getter();
             //return "Author Name: " + name + " Email: " + emailId + " Gender: " + gender;
}
class Aut extends Author{
    Aut(String name, String emailId, char gender){
        super(name,emailId, gender);
    }
   public String getter(){
        return "Author Name: " + setter() + " Email: " + setteremail() + " Gender: " + settergender();
    }
}
class Book{
   private String bookname;
   private Author author;
   private double price;
    private int qtyInStock;
    Book(String bookname,Author author,double price,int qtyInStock){
        this.bookname=bookname;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
         System.out.println(author.getter());
        System.out.println("Book Name "+bookname +" price "+price+" Stock "+qtyInStock);
    }
    public static void main (String args[]){
         Book b = new Book("The Junior", new Aut("Eddy","eddy@gmail.com",'M'), 1000.00, 1);
    }
    
}