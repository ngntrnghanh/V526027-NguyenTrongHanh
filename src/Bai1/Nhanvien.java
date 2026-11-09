package Bai1;

import java.util.Scanner;

public class Nhanvien extends Nguoi {
    public static final double LCB = 1.5;          // luong co ban (trieu)
    public static final double PHU_CAP_MOI_NAM = 0.2; // phu cap / 1 nam (trieu)

    private int snct;   // so nam cong tac
    private double hsl; // he so luong

    public Nhanvien() {
        super();
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    public int getSnct() { return snct; }
    public void setSnct(int snct) { this.snct = snct; }
    public double getHsl() { return hsl; }
    public void setHsl(double hsl) { this.hsl = hsl; }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine().trim());
    }

    // tienluong = lcb * hsl + phucap, phucap = 0.2 * snct (don vi: trieu)
    public double tinhTienLuong() {
        double phuCap = PHU_CAP_MOI_NAM * snct;
        return LCB * hsl + phuCap;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(", SNCT: %d, HSL: %.2f, Tien luong: %.3f trieu%n",
                snct, hsl, tinhTienLuong());
    }
}
