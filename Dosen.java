public class Dosen {
    private String kode;
    private String nama;
    private Boolean jenisKelamin;
    private int usia;

    public Dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getJenisKelaminText() {
        return jenisKelamin ? "Pria" : "Wanita";
    }

    public int getUsia() {
        return usia;
    }

    public void tampilkanData() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + getJenisKelaminText());
        System.out.println("Usia\t\t: " + usia);
    }
}