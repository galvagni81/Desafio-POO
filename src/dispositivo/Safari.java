package dispositivo;

import model.NavegadorInternet;

public class Safari implements NavegadorInternet {

    @Override
    public void conectarInternet() {
        System.out.println("Safari conectado à internet.");
    }

    @Override
    public void exibirPagina(String endereco) {
        System.out.println("Endereço \'" + endereco + "\' sendo exibida no navegador Safari.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada ao navegador Safari.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página do Safari atualizada.");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página do Safari fechada.");
    }
    
}
