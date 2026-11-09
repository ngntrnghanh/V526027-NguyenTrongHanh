package Bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nhan vien n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        // 1. Nhap n nhan vien
        List<Nhanvien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("--- Nhan vien thu " + i + " ---");
            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);
            ds.add(nv);
        }

        // 2. Tim nhan vien co so nam cong tac nhieu nhat
        if (!ds.isEmpty()) {
            Nhanvien max = ds.get(0);
            for (Nhanvien nv : ds) {
                if (nv.getSnct() > max.getSnct()) max = nv;
            }
            System.out.println("\nNhan vien co so nam cong tac nhieu nhat:");
            max.xuat();
        }

        // 3. In danh sach theo luong giam dan
        ds.sort(Comparator.comparingDouble(Nhanvien::tinhTienLuong).reversed());
        System.out.println("\nDanh sach nhan vien theo luong tu cao den thap:");
        for (Nhanvien nv : ds) {
            nv.xuat();
        }
        sc.close();
    }
}
