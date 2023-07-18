public class CalculadoraCortisol {
    public static void main(String[] args) {
        double cortisol = 18;

        if (cortisol >= 6 && cortisol <= 18.4) {
            System.out.println("Cortisol normal");
        } else if(cortisol > 18.4) {
            System.out.println("Cortisol alto");
        } else {
            System.out.println("Cortisol baixo");
        }
    }
}
