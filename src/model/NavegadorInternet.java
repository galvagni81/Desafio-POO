package model;

public interface NavegadorInternet {
    void conectarInternet();
    void exibirPagina(String endereco);
    void adicionarNovaAba();
    void atualizarPagina();
    void fecharPagina();
}
