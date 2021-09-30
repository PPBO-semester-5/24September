public class KenaikanGajiTest {
    /**
     * Main Method
     */
    public static void main (String[] args) {
        KenaikanGaji Santi =
                new KenaikanGaji ("SBY0001", "Manager", 4000000, 5);
        KenaikanGaji Ronny =
                new KenaikanGaji ("BDG0317", "Staff", 2000000, 7.5);
        KenaikanGaji Indra =
                new KenaikanGaji ("JKT0189", "Direktur", 8000000, 3);

        double gajiSanti = Santi.getGajiBaru();
        double gajiRonny = Ronny.getGajiBaru();
        double gajiIndra = Indra.getGajiBaru();

        String idSanti = Santi.getNoPegawai();
        String idRonny = Ronny.getNoPegawai();
        String idIndra = Indra.getNoPegawai();

        String jbSanti = Santi.getJabatan();
        String jbRonny = Ronny.getJabatan();
        String jbIndra = Indra.getJabatan();

        //Mencetak semua informasi ke console
        System.out.println("\nPROGRAM MENGHITUNG KENAIKAN GAJI");
        System.out.println("--------------------------------\n");

        System.out.println("Santi");
        System.out.println("No Pegawai" + "\t" + ":" + idSanti);
        System.out.println("Jabatan" + "\t\t" + ":" + jbSanti);
        System.out.println("Gaji Baru" + "\t" + ":" + gajiSanti + "\n");

        System.out.println("Ronny");
        System.out.println("No Pegawai" + "\t" + ":" + idRonny);
        System.out.println("Jabatan" + "\t\t" + ":" + jbRonny);
        System.out.println("Gaji Baru" + "\t" + ":" + gajiRonny + "\n");

        System.out.println("Indra");
        System.out.println("No Pegawai" + "\t" + ":" + idIndra);
        System.out.println("Jabatan" + "\t\t" + ":" + jbIndra);
        System.out.println("Gaji Baru" + "\t" + ":" + gajiIndra + "\n");
    }
}


class KenaikanGaji {
    //Mendeklarasikan variabel-variabel
    private double gajipokok;
    private double persenNaik;
    private String jabatan;
    private String noPegawai;

    /**Method konstruktor yang akan menginisialisasi variabel*/
    public KenaikanGaji (String noPegawai, String jabatan, double gajipokok, double persenNaik) {
        this.noPegawai = noPegawai;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
        this.persenNaik = persenNaik;
    }

    /**Method yang mengembalikan besar gaji baru*/
    public double getGajiBaru() {
        double gajiBaru = gajipokok + (persenNaik/100)* gajipokok;
        return gajiBaru;
    }

    /**Method yang mengembalikan no ID pegawai*/
    public String getNoPegawai() {
        return noPegawai;
    }

    /**Method yang mengembalikan jabatan*/
    public String getJabatan() {
        return jabatan;
    }
}