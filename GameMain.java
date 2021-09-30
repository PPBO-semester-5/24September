class GameOop {
    private String name;
    private int lifePoint;
    private int powerTendangan;
    private int powerPukulan;
    // Konstruktor Game
    public GameOop (String name, int powerPukulan, int powerTendangan) {
        this.name = name;
        this.lifePoint = 100;
        this.powerTendangan = powerTendangan;
        this.powerPukulan = powerPukulan;
    }
    // Method Tendangan
    public void tendang (GameOop karB) {
        karB.lifePoint -= this.powerTendangan;
    }
    // Method Pukulan
    public void pukul (GameOop karB) {
        karB.lifePoint -= this.powerPukulan;
    }
    // Setter Getter Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Getter LifePoint
    public int getLifePoint() {
        return lifePoint;
    }
}

public class GameMain {
    public static void main(String[] args) {
        GameOop wiro_sableng = new GameOop("Wiro Sableng", 10, 20);
        GameOop gundala = new GameOop("Gundala", 5, 25);

        // Menampilkan Objek Player
        System.out.println("<-- Player 1 -->");
        System.out.println("Name\t\t: " + wiro_sableng.getName());
        System.out.println("Life Point\t: " + wiro_sableng.getLifePoint() + "\n");

        System.out.println("<-- Player 2 -->");
        System.out.println("Name\t\t: " + gundala.getName());
        System.out.println("Life Point\t: " + gundala.getLifePoint() + "\n");

        System.out.println("=================================================");
        System.out.println("\t\t\t...PERTARUNGAN DIMULAI...");
        System.out.println("=================================================");

        // Skenario No. 3
        System.out.println("Ronde 1");
        System.out.println("Wiro Sableng memulai pertarungan dengen melakukan tendangan pada Gundala");
        wiro_sableng.tendang(gundala);
        System.out.println("Life Point Wiro Sableng : " + wiro_sableng.getLifePoint());
        System.out.println("Life Point Gundala \t\t: " + gundala.getLifePoint() + "\n");

        // Skenario No. 4
        System.out.println("Ronde 2");
        System.out.println("Gundala melakukan perlawanan dengan menendang balik Wiro Sableng");
        gundala.tendang(wiro_sableng);
        System.out.println("Life Point Wiro Sableng : " + wiro_sableng.getLifePoint());
        System.out.println("Life Point Gundala \t\t: " + gundala.getLifePoint() + "\n");

        // Skenario No. 5
        System.out.println("Ronde 3");
        System.out.println("Gundala menyerang Wiro Sableng dengan pukulan berturut-turut sebanyak 3x");
        for (int i = 0; i < 3; i++) {
            gundala.pukul(wiro_sableng);
        }
        System.out.println("Life Point Wiro Sableng : " + wiro_sableng.getLifePoint());
        System.out.println("Life Point Gundala \t\t: " + gundala.getLifePoint() + "\n");

        // Skenario No. 6
        System.out.println("Ronde 4");
        System.out.println("Wiro Sableng melakukan tendangan berturut-turut 4x kepada Gundala");
        for (int i = 0; i < 4; i++) {
            wiro_sableng.tendang(gundala);
        }
        System.out.println("Life Point Wiro Sableng : " + wiro_sableng.getLifePoint());
        System.out.println("Life Point Gundala \t\t: " + gundala.getLifePoint() + "\n");


        // Skenario No. 7
        System.out.println("=================================================");
        System.out.println("\t\t\t...PERTARUNGAN BERAKHIR...");
        String winner = wiro_sableng.getLifePoint() > gundala.getLifePoint() ?
                "Wiro Sableng" : "Gundala";

        // Skenario No. 8
        System.out.println("Pemenangnya adalah  \t: " + winner);
        System.out.println("Dengan Life Point \t\t: " + wiro_sableng.getLifePoint());
        System.out.println("=================================================");
    }
}