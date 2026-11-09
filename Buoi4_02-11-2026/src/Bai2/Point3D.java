package Bai2;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        this(0, 0, 0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    // Khoang cach tu diem 3D den goc toa do (override)
    @Override
    public double distance() {
        double d2 = super.distance();
        return Math.sqrt(d2 * d2 + z * z);
    }

    // Khoang cach giua 2 diem 3D (overload)
    public double distance(Point3D p) {
        double dx = getX() - p.getX();
        double dy = getY() - p.getY();
        double dz = z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Diem doi xung qua goc toa do (override)
    @Override
    public Point3D symmetric() {
        return new Point3D(-getX(), -getY(), -z);
    }

    // Tinh tien theo dx, dy, dz (overload)
    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "Point3D [x=" + getX() + ", y=" + getY() + ", z=" + z + "]";
    }
}
