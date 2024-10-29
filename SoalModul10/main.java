package SoalModul10;

public class main {
    public static void main(String[] args) {
        Pembayaran kulkas = new Elektronik();
        System.out.println("Pembayaran Pajak Elektronik Kulkas (10%) : Rp. " 
                + kulkas.hitungPajak(500000));
        
        Pembayaran bakso = new Makanan();
        System.out.println("Pembayaran Pajak Makanan Bakso (5%) : Rp. " 
                + bakso.hitungPajak(20000));
    }
}
