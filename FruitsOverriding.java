class Fruit{
 String name;
 String taste;
 int size;
 Fruit(String name, String taste, int size){
    this.name=name;
    this.taste=taste;
    this.size=size;
 }
 void eat(){
    System.out.println(name+" is "+taste+"and size is"+size);
 }
}
class Apple extends Fruit{
    Apple(){
        super("apple","sour-sweet",6);
    }
    void eat(){
         System.out.println("Apple is sour - sweet taste");
    }
}
class Orange extends Fruit{
     Orange(){
        super("orange","sour-jucy",6);
    }
    void eat(){
         System.out.println("Orange is sour-jucy taste");
    }
}

class FruitsOverriding{
    public static void main (String args[]){
        Orange o=new Orange();
        Apple a = new Apple();
        a.eat();
        o.eat();

    }
}