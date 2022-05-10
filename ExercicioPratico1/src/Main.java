
public class Main {
    public static void main(String[] args) {

        System.out.println("Exercicio de calculadora:");
        Calculadora.soma(2, 6.5f);
        Calculadora.subtracao(2, 10);
        Calculadora.multiplicacao(5, 6.5f);
        Calculadora.divisao(5.5f, 6.5f);

        System.out.println("Exercicio horários do dia:");
        MensagemHorarioDoDia.receberMensagem(10);
        MensagemHorarioDoDia.receberMensagem(4);
        MensagemHorarioDoDia.receberMensagem(23);
        MensagemHorarioDoDia.receberMensagem(17);

        System.out.printf("Exercício custo de emprestimos:");
        EmprestimoBanco.calculoTaxaEmprestimo(1000,2);
        EmprestimoBanco.calculoTaxaEmprestimo(1000,3);
        EmprestimoBanco.calculoTaxaEmprestimo(1000,4);

    }
}