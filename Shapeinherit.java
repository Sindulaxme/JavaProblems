class Shape{
    void draw(){
        System.out.println("Drawing Shapes");
    }
    void erase(){
        System.out.println("Erasing Shapes");
    }
}
class Circle extends Shape{
     void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape{
     void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
     void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}
class  Shapeinherit{
    public static void main (String args[]){
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s=new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}