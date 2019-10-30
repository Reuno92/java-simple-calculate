abstract class Shape {

    protected int x, y;

    Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    abstract double perimeter();
}
