class Pecahan{
    int pembilang;
    int penyebut;

    //constructor untuk mengatur atribut dari class Pecahanan
    public Pecahan(int pembilang, int penyebut){
        this.pembilang=pembilang;
        this.penyebut=penyebut;
    }

    //method getter
    int getPembilang(){
        return pembilang;
    }

    int getPenyebut(){
        return penyebut;
    }

    //method setter
    public void setPembilang(int pembilang){
        this.pembilang=pembilang;
    }

    public void setPenyebut(int penyebut){
        this.penyebut=penyebut;
    }

    //method tambah
    public Pecahan tambah(Pecahan a, Pecahan b){
        Pecahan p = new Pecahan(1,1);

        p.pembilang = ((a.pembilang * b.penyebut) + (b.pembilang * a.penyebut));
        p.penyebut = (a.penyebut * b.penyebut);
        return p;
    }

    //method tampil
    public String tampil(){
        String h;
        h = (this.pembilang + "/" + this.penyebut);
        return h;
    }

}

public class PecahanTest{
    public static void main(String[] args){
        int pembilang;
        int penyebut;

        Pecahan ob1 = new Pecahan(3,2);
        Pecahan ob2 = new Pecahan(5,6);
        Pecahan hitung = new Pecahan(1,1);
        hitung = hitung.tambah(ob1,ob2);

        System.out.println("Objek 1: " + ob1.tampil());
        System.out.println("Objek 2: " + ob2.tampil());
        System.out.println("Hasil Penambahan: " + ob1.tampil() + " + " + ob2.tampil() + " = " + hitung.tampil());


    }
}