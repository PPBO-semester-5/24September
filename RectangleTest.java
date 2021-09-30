class Rectangle{
    double length, width;

    //constructor pertama
    public Rectangle(){
        length=0.0;
        width=0.0;
    }

    //constructor kedua
    public Rectangle(double nilai){
        this.length=nilai;
        this.width=nilai;
    }

    //constructor ketiga
    public Rectangle(String s){
        length = Double.parseDouble(s);
        width = Double.parseDouble(s);
    }

    //constructor keempat
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    //method
    public double keliling(){
        double keliling = (2*(length + width));
        return keliling;
    }

    //method
    public double luas(){
        double luas = length * width;
        return luas;
    }

}

public class RectangleTest{
    public static void main(String[] args){

        //instantiasi
        Rectangle a1 = new Rectangle();
        Rectangle a2 = new Rectangle(2);
        Rectangle a3 = new Rectangle("3");
        Rectangle a4 = new Rectangle(2, 5);

        System.out.println("\nPROGRAM MENGHITUNG RECTANGLE");
        System.out.println("--------------------------------\n");

        //Memanggil construktor pertama dengan objek pertama a1
        System.out.println("Constructor Pertama \n"+ "Panjang: " + a1.length + "\nLebar: " + a1.width);
        System.out.println("Keliling Rectangle : " + a1.keliling());
        System.out.println("Luas Rectangle : " + a1.luas() + "\n");

        //Memanggil construktor kedua dengan objek kedua a2
        System.out.println("Constructor Kedua \n"+ "Panjang: " + a2.length + "\nLebar: " + a2.width);
        System.out.println("Keliling Rectangle : " + a2.keliling());
        System.out.println("Luas Rectangle : " + a2.luas() + "\n");

        //Memanggil construktor ketiga dengan objek ketiga a3
        System.out.println("Constructor Ketiga \n"+ "Panjang: " + a3.length + "\nLebar: " + a3.width);
        System.out.println("Keliling Rectangle : " + a3.keliling());
        System.out.println("Luas Rectangle : " + a3.luas() + "\n");

        //Memanggil construktor keempat dengan objek keempat a4
        System.out.println("Constructor Keempat \n"+ "Panjang: " + a4.length + "\nLebar: " + a4.width);
        System.out.println("Keliling Rectangle : " + a4.keliling());
        System.out.println("Luas Rectangle : " + a4.luas() + "\n");
    }
}