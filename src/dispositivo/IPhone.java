package dispositivo;

import model.AparelhoTelefonico;
import model.NavegadorInternet;
import model.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no iPhone...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada no Iphone.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no iPhone.");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume do iPhone aumentado em +1.");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Volume do iPhone reduzido em -1.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("iPhone conectado à internet.");
    }

    @Override
    public void exibirPagina(String endereco) {
        System.out.println("Endereço \'" + endereco + "\' sendo exibida no navegador do iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada ao navegador do iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador do iPhone.");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página do navegador do iPhone fechada.");
    }

    @Override
    public void selecionarContato() {
        System.out.println("Contato selecionado no navegador do iPhone.");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Ligacao efetuada com sucesso pelo iPhone.");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida com sucesso pelo iPhone.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado com sucesso no iPhone.");
    }
}
