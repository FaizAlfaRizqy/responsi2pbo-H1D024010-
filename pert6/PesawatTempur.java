package pert6;

public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 3; // 3% per km
        
        if (getLevelEnergi() < energiDibutuhkan) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    public void isiEnergi(int jumlah) {
        setLevelEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi pesawat tempur diisi sebanyak " + jumlah + "%.");
    }

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak mencukupi! Hanya tersisa " + jumlahRudal + " rudal.");
        }
    }
}