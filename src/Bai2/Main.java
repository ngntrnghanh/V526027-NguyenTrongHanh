package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Danh sach diem gom ca 2D va 3D
        List<Point2D> list = new ArrayList<>();
        list.add(new Point2D(1.0, 5.0));
        list.add(new Point2D(3.0, 7.0));
        list.add(new Point3D(1.0, 5.0, 3.5));
        list.add(new Point3D(3.0, 7.0, 2.0));

        System.out.println("Danh sach diem ban dau:");
        for (Point2D p : list) System.out.println(p);

        // Tong khoang cach cac diem 2D va cac diem 3D
        double sum2D = 0, sum3D = 0;
        for (Point2D p : list) {
            if (p instanceof Point3D) sum3D += p.distance();
            else sum2D += p.distance();
        }
        System.out.println("\nTong khoang cach cac diem 2D: " + sum2D);
        System.out.println("Tong khoang cach cac diem 3D: " + sum3D);

        // Dua cac diem doi xung vao danh sach
        List<Point2D> symmetrics = new ArrayList<>();
        for (Point2D p : list) symmetrics.add(p.symmetric()); // da hinh
        list.addAll(symmetrics);

        System.out.println("\nDanh sach sau khi them cac diem doi xung:");
        for (Point2D p : list) System.out.println(p);

        // Demo tinh tien
        Point2D a = new Point2D(1, 2);
        a.translate(2, 3);
        Point3D b = new Point3D(1, 2, 3);
        b.translate(1, 1, 1);
        System.out.println("\nSau tinh tien: " + a + " | " + b);
        System.out.println("Khoang cach 2 diem 2D: " + new Point2D(0, 0).distance(new Point2D(3, 4)));
        System.out.println("Khoang cach 2 diem 3D: " + new Point3D(0, 0, 0).distance(new Point3D(1, 2, 2)));
    }
}
