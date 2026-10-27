
public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor khong tham so
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    // Constructor co tham so
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        setMauSo(mauSo);
    }

    // Getter
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    // Setter
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException(
                    "Mau so phai khac 0!"
            );
        }
        this.mauSo = mauSo;
    }

    // Ham tim UCLN
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Rut gon phan so
    public PhanSo rutGon() {
        int ucln = UCLN(tuSo, mauSo);

        if (ucln != 0) {
            tuSo /= ucln;
            mauSo /= ucln;
        }

        // Dua dau am len tu so
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }

        return this;
    }

    // Cong hai phan so
    public PhanSo cong(PhanSo p) {
        int tu = this.tuSo * p.mauSo
                + p.tuSo * this.mauSo;
        int mau = this.mauSo * p.mauSo;

        return new PhanSo(tu, mau).rutGon();
    }

    // Tru hai phan so
    public PhanSo tru(PhanSo p) {
        int tu = this.tuSo * p.mauSo
                - p.tuSo * this.mauSo;
        int mau = this.mauSo * p.mauSo;

        return new PhanSo(tu, mau).rutGon();
    }

    // Nhan hai phan so
    public PhanSo nhan(PhanSo p) {
        int tu = this.tuSo * p.tuSo;
        int mau = this.mauSo * p.mauSo;

        return new PhanSo(tu, mau).rutGon();
    }

    // Chia hai phan so
    public PhanSo chia(PhanSo p) {
        if (p.tuSo == 0) {
            throw new ArithmeticException(
                    "Khong the chia cho phan so 0!"
            );
        }

        int tu = this.tuSo * p.mauSo;
        int mau = this.mauSo * p.tuSo;

        return new PhanSo(tu, mau).rutGon();
    }

    // So sanh hai phan so
    // Tra ve 1 neu lon hon, -1 neu nho hon,
    // 0 neu bang nhau
    public int soSanh(PhanSo p) {
        long a = (long) this.tuSo * p.mauSo;
        long b = (long) p.tuSo * this.mauSo;

        // Mau so co the am nen can chuan hoa dau
        if (this.mauSo < 0) a = -a;
        if (p.mauSo < 0) b = -b;

        return Long.compare(a, b);
    }

    // Kiem tra phan so co la so nguyen khong
    public boolean laSoNguyen() {
        return tuSo % mauSo == 0;
    }

    // Hien thi phan so
    @Override
    public String toString() {
        PhanSo p = new PhanSo(tuSo, mauSo);
        p.rutGon();

        if (p.mauSo == 1) {
            return String.valueOf(p.tuSo);
        }

        return p.tuSo + "/" + p.mauSo;
    }
}
