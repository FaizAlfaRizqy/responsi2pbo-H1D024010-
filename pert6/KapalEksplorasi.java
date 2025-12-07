package pert6;
public class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan; 


    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 2; // 2% per km
        
        if (getLevelEnergi() < energiDibutuhkan) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    public void isiEnergi(int jumlah) {
        setLevelEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi kapal eksplorasi diisi sebanyak " + jumlah + "%.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + 
                         " dengan modul level " + modulScan + ".");
    }
}