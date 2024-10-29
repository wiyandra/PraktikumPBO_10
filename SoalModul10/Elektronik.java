package SoalModul10;

public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(int a) {
        return a * 0.10;
    }
}
