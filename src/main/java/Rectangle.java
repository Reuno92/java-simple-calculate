public class Rectangle extends Shape {

    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height)
    {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double perimeter() {
        return (width * height) * 2;
    }
}
