class MethodOverload {
    // Method Overload
    public void Kuadrat (int a, int b) {
        double kuadrat;
        kuadrat = Math.pow(a, b);
        System.out.println("Hasil kuadrat 6 adalah " + kuadrat);
    }
    public void Kuadrat (double a, double b) {
        double kuadrat;
        kuadrat = Math.pow(a, b);
        System.out.println("Hasil kuadrat 6.45 adalah " + kuadrat);
    }
}

public class MethodOverloadTest {
    public static void main (String[] args) {
        System.out.println("\nDEMO METHOD OVERLOADING");
        System.out.println("-----------------------\n");

        MethodOverload kuadrat = new MethodOverload();

        System.out.println("Method 'kuadrat' pertama");
        kuadrat.Kuadrat(6, 2);

        System.out.println("Method 'kuadrat' kedua");
        kuadrat.Kuadrat(6.45, 2);
    }
}