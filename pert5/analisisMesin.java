class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] mesinArray = new defaultMesin[5];

        mesinArray[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        
        mesinArray[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);

        mesinArray[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        
        mesinArray[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        
        mesinArray[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin mesin : mesinArray) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa: " + mesin.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        for (defaultMesin mesin : mesinArray) {
            if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            } else if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        defaultMesin mesinTertinggi = mesinArray[0];
        double performaTertinggi = mesinArray[0].nilaiPerforma();
        
        for (defaultMesin mesin : mesinArray) {
            if (mesin.nilaiPerforma() > performaTertinggi) {
                performaTertinggi = mesin.nilaiPerforma();
                mesinTertinggi = mesin;
            }
        }
        
        System.out.println(mesinTertinggi.namaMesin + " --> " + performaTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        defaultMesin[] mesinSorted = mesinArray.clone();
        
        for (int i = 0; i < mesinSorted.length - 1; i++) {
            for (int j = 0; j < mesinSorted.length - i - 1; j++) {
                if (mesinSorted[j].nilaiPerforma() < mesinSorted[j + 1].nilaiPerforma()) {
                    defaultMesin temp = mesinSorted[j];
                    mesinSorted[j] = mesinSorted[j + 1];
                    mesinSorted[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < 3 && i < mesinSorted.length; i++) {
            System.out.println((i + 1) + ". " + mesinSorted[i].namaMesin + " --> " + mesinSorted[i].nilaiPerforma());
        }
    }
}
