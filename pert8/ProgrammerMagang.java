package pert8;

public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {    
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false; // default
    }

    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * gajiPerJam;
        System.out.println("Gaji " + nama + " (" + jamKerja + " jam) adalah: Rp " + totalGaji);
        return totalGaji;
    }
    
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }
    
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }
    
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }
    
    public void logout() {
        sedangLogin = false;
        System.out.println(nama + " berhasil logout.");
    }
    
    public String getRoleAkses() {
        return "Magang IT";
    }
}