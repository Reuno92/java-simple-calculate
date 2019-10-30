public class Circle extends Shape {

    private int radius;
    Circle(int x, int y, int r)
    {
        super(x, y);
        this.radius = r;
    }

    @Override
    double perimeter() {
        return (Math.PI*2)*this.radius;
    }

    @Override
    double area() {
        return Math.PI*(radius * radius);
    }
}
