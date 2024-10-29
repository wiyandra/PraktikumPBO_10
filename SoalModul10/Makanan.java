package SoalModul10;

public class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(int a) {
        return a * 0.05;
    }
}
