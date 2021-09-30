public class PrisonTest {
    public static void main(String[] args){
        Cell c01 = new Cell("Cell 01", "123");
        Cell c02 = new Cell("Cell 02", "321");
        Prisoner p01 = new Prisoner("Bubba", 170, c01);
        Prisoner p02 = new Prisoner("Babba", 165, c01);
        p01.display();
        p02.display();
        c01.openDoor("123");
        p01.display();
    }
}

class Prisoner {
    private String nama;
    private int tinggi;
    private Cell cell;

    Prisoner (String nama, int tinggi, Cell cell) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.cell = cell;
    }

    Prisoner (int tinggi, String nama) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    Prisoner (String nama) {
        this.nama = nama;
        this.tinggi = 0;
    }

    Prisoner (int tinggi, Cell cell) {
        this.nama = "";
        this.tinggi = tinggi;
    }

    Prisoner () {
        this.nama = "nama";
        this.tinggi = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi (int tinggi) {
        this.tinggi = tinggi;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell (Cell cell) {
        this.cell = cell;
    }

    public void display() {
        System.out.println("Nama: "+this.nama);
        System.out.println("Tinggi: "+this.tinggi);
        System.out.println("no. cell: "+this.cell.getNamaCell());
        System.out.println("status cell: "+this.cell.isOpen());
    }
}

class Cell {
    private String namaCell;
    private String key;
    private boolean isOpen;

    Cell (String namaCell, String key) {
        this.namaCell = namaCell;
        this.key = key;
        isOpen = false;
    }

    public String getNamaCell() {
        return namaCell;
    }

    public void setNamaCell (String namaCell) {
        this.namaCell = namaCell;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen (boolean open) {
        isOpen = open;
    }

    public String getKey() {
        return key;
    }

    public void openDoor (String key) {
        if(key.equals(getKey())) {
            if(isOpen() == true) {
                setOpen(false);
            }
            else{
                setOpen(true);
            }
        }
    }
}