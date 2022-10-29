package task2;

public class TestShape {
    public static void main(String[] args){
        Shape s = new Shape();
        System.out.println(s.toString());
        
        Shape s2 = new Shape("blue",false);
        System.out.println(s2.toString());
        
        Circle c = new Circle();
        System.out.println(c.toString());
        
        Rectangle r = new Rectangle(4.0, 5.0);
        System.out.println(r.toString());
    }
}
