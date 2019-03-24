class Shape extends Display{
    int length,height;

    Shape(){
        System.out.println("Shape");
    }

    Shape(int l,int h){
        super(l,h);
        length = l;
        height = h;
    }

    public int area(){
        return length*height;
    }
}

class Display {
    Display(){
        System.out.println("Display");
    }

    Display(int l, int h){
        //do nothing
    }

    public void show(int area){
        System.out.println("Area of the rectangle is :" + area);
    }
}

public class Rectangle extends Shape {
    Rectangle(){
        System.out.println("Rectangle");
    }

    Rectangle(int l,int h){
        super(l,h);
    }

    public static void main(String[] args){
        new Rectangle();
        Rectangle rect = new Rectangle(2,2);
        rect.show(rect.area());
    }
}
