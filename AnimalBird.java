class Animal{
    void eat(){
        System.out.println("It can Eat");
    }
    void sleep(){
        System.out.println("It can Sleep");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("It can fly");
    }
}
class AnimalBird{
    public static void main (String args[]){
        Animal a = new Animal();
        Bird b = new Bird ();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}