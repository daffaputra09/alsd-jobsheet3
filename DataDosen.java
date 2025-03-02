public class DataDosen {
    public void dataSemuaDosen(Dosen[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        System.out.println("================");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].tampilkanData();
            System.out.println("------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.getJenisKelaminText().equals("Pria")) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("\nJumlah Dosen per Jenis Kelamin:");
        System.out.println("==============================");
        System.out.println("Jumlah Dosen Pria\t: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita\t: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.getJenisKelaminText().equals("Pria")) {
                totalUsiaPria += dosen.getUsia();
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.getUsia();
                jumlahWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen per Jenis Kelamin:");
        System.out.println("=====================================");
        System.out.println("Rata-rata usia Dosen Pria\t: " + 
            (jumlahPria > 0 ? (double)totalUsiaPria/jumlahPria : 0));
        System.out.println("Rata-rata usia Dosen Wanita\t: " + 
            (jumlahWanita > 0 ? (double)totalUsiaWanita/jumlahWanita : 0));
    }

    public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen dosenTertua = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.getUsia() > dosenTertua.getUsia()) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nInfo Dosen Paling Tua:");
        System.out.println("=====================");
        dosenTertua.tampilkanData();
    }

    public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen dosenTermuda = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.getUsia() < dosenTermuda.getUsia()) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nInfo Dosen Paling Muda:");
        System.out.println("======================");
        dosenTermuda.tampilkanData();
    }
}