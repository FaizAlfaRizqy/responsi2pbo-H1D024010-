public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;     
    private double nominalPembayaran;
    private double saldoPengguna;     

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoPengguna = saldoPengguna;
    }

    public void processPayment() {
        System.out.println("Memproses pembayaran sebesar " + nominalPembayaran + "...");
        System.out.println();
        
        if (saldoPengguna >= nominalPembayaran) {
            saldoPengguna -= nominalPembayaran;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }
    
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }
    
    public double getTransactionFee() {
        return 2000.0;
    }
    
    public double getBalance() {
        return saldoPengguna;
    }
}