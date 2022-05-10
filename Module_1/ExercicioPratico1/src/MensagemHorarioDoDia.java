public class MensagemHorarioDoDia {

    public static void receberMensagem(int hora) {

        if (hora <= 12 && hora >= 5) {
            mensagemBomDia();
        } else if (hora > 12 && hora <= 18) {
            mensagemBoaTarde();
        } else {
            mensagemBoaNoite();
        }

    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa noite");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Boa tarde");
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia");
    }
}
