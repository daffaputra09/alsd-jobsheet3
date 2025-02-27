import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah yang ingin diinput: ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine(); 
        Matakuliah[] arrayOfMatakuliah = new Matakuliah[jumlahMatakuliah];

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData();
            System.out.println("-----------------------------------------");
        }

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
