public class PaymentTest {

    public static void main(String[] args) {
        EWalletPayment payment = new EWalletPayment("OVO", 50000, 150000);
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println("Saldo awal: " + payment.getBalance());
        payment.processPayment();
        System.out.println("Sisa saldo: " + payment.getBalance());
        System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
    }
}