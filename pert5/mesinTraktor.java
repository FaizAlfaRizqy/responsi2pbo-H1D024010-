class mesinTraktor extends defaultMesin {
    double kapasitasTarik;

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Tenaga: " + tenagaHP + " HP");
    }

    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup Mesinnn!");
    }
}
