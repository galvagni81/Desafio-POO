package dispositivo;

import model.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void selecionarContato() {
        System.out.println("Contato selecionado no telefone.");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Ligacao efetuada com sucesso pelo telefone.");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida com sucesso no telefone.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado com sucesso no telefone.");
    }
}
