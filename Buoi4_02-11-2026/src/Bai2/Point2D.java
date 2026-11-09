package Bai2;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0, 0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // Khoang cach tu diem den goc toa do
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Khoang cach giua 2 diem 2D (overload)
    public double distance(Point2D p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Diem doi xung qua goc toa do
    public Point2D symmetric() {
        return new Point2D(-x, -y);
    }

    // Tinh tien theo do lech dx, dy
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }
}
