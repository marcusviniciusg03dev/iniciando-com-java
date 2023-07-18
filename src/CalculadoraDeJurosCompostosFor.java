public class CalculadoraDeJurosCompostosFor {

    public static void main(String[] args) {
        double valor = 10_000;
        final double taxa = .8;
        final int periodoEmMeses = 12;

        for (int mes = 1; mes <= periodoEmMeses; mes++) {
            valor += valor * taxa / 100;
            System.out.println("mês: " + mes + " = " + valor);
        };
    }

}
