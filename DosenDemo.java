import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen[] daftarDosen = new Dosen[3]; 

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode\t\t: ");
            String kode = input.nextLine();
            
            System.out.print("Nama\t\t: ");
            String nama = input.nextLine();
            
            System.out.print("Jenis Kelamin\t: ");
            String jenisKelaminInput = input.nextLine();
            Boolean jenisKelamin = jenisKelaminInput.equalsIgnoreCase("Pria");
            
            System.out.print("Usia\t\t: ");
            int usia = Integer.parseInt(input.nextLine());
            
            daftarDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }

        DataDosen analisis = new DataDosen();

        analisis.dataSemuaDosen(daftarDosen);

        analisis.jumlahDosenPerJenisKelamin(daftarDosen);

        analisis.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        analisis.infoDosenPalingTua(daftarDosen);

        analisis.infoDosenPalingMuda(daftarDosen);
    }
}