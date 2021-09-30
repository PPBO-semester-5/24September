import java.text.DecimalFormat;

public class HitungGajiTest {
    /**
     * Main Method
     */
    public static void main (String[] Args) {
        
        //Mengeset tampilan hasil menjadi dua digit desimal
        DecimalFormat digitPresisi = new DecimalFormat("0.00");

        System.out.println("\nDEMO ENKAPSULASI");
        System.out.println("----------------\n");

        //Membuat instans dari kelas hitungGaji untuk suatu
        //pegawai, dan memanggil method-methodnya.
        HitungGaji tony = new HitungGaji();
        tony.setGaji(2500000);
        tony.hitunganGaji();

        System.out.println("Informasi Gaji Pegawai");
        System.out.println("\nBesar Gaji Kotor: " + digitPresisi.format(tony.getGajiKotor()));
        System.out.println("\nBesar Gaji yang dibawa pulang: " + digitPresisi.format((tony.getGajiBersih())));
    }
}

class HitungGaji {
    /* Mendeklarasikan variabel-variabel internal kelas HitungGaji.
    Variabel potongan menyatakan dana untuk Asuransi Kesehatan
    (Akses), iuran koperasi, cicilan keandaraan dan sebagainya.
    Hanya variabel gajiKotor dan gajiBersih yang dapat diakses
    oleh "lingkungan luar"
     */
    private double gajiKotor, gajiSetelahPajak;
    public double gajiBersih;
    private double potongan = 75000.00;

    //Method untuk mengeset variabel internal gajiKotor
    public void setGaji (double gaji) {
        gajiKotor = gaji;
    }

    //Method untuk menghitung gaji bersih
    public void hitunganGaji() {
        gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
        gajiBersih = gajiSetelahPajak - potongan;
    }

    //Method yang mengembalikan gaji kotor
    public double getGajiKotor() {
        return gajiKotor;
    }

    //Method yang mengembalikan besar gaji bersih
    public double getGajiBersih() {
        return gajiBersih;
    }
}