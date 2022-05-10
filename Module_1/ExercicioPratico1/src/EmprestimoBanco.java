public class EmprestimoBanco {
    public static void calculoTaxaEmprestimo(double valorDeEntrada, int parcelas) {
        if (parcelas == 2){
            double valorFinal = valorDeEntrada + (valorDeEntrada * TaxaDuasParcelas());
            System.out.println("Valor final com empréstimo de 2 parcelas é: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valorDeEntrada + (valorDeEntrada * TaxaTresParcelas());
            System.out.println("Valor final com empréstimo de 3 parcelas é: R$ " + valorFinal);
        }
        else {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }

    private static double TaxaDuasParcelas() {
        return 0.2;
    }
    private static double TaxaTresParcelas() {
        return 0.3;
    }

}
