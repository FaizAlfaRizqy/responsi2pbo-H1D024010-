class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        Karyawan karyawan = new Karyawan("Budi Santoso", 4000000);
        
        System.out.println("Status: Karyawan Biasa");
        karyawan.tampilInfo();
        
        System.out.println();

        Manajer manajer = new Manajer("Siti Aminah", 6000000, 2500000);
        
        System.out.println("Status: Manajer");
        manajer.tampilInfo();
    }
}