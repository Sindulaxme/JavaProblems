class Author{
    private String name;
    private String emailId;
    private char gender;
    Author(String name, String emailId, char gender){
        this.name=name;
        this.emailId=emailId;
        this.gender=gender;
        System.out.print("Name "+name+" email Id "+emailId+" gender "+gender);
    }
    public static void main (String args[]){
        Author a = new Author("Eddy","eddy@gmail.com",'M');
    }
    
}