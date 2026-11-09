package Bai1;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;

    public Nguoi() {
        this("", 0);
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public int getTuoi() { return tuoi; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine().trim());
    }

    public void xuat() {
        System.out.print("Ho ten: " + hoTen + ", Tuoi: " + tuoi);
    }
}
