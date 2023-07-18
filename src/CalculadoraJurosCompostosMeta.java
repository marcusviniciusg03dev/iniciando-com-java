public class CalculadoraJurosCompostosMeta {
    public static void main(String[] args) {
        double valorAcumulado = 10_000;
        final double valorMeta = 20_000;
        final double taxaJurosMensal = .8;
        int mes = 1;

        while (valorAcumulado < valorMeta) {
            mes++;

            valorAcumulado += valorAcumulado * taxaJurosMensal / 100;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }
    }
}
