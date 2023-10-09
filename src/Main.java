import dispositivo.IPhone;
import dispositivo.IPod;
import dispositivo.Safari;
import dispositivo.Telefone;

public class Main {
    public static void main(String[] args) {
        
        Telefone telefone = new Telefone();
        telefone.selecionarContato();
        telefone.fazerLigacao();
        telefone.atenderLigacao();
        telefone.iniciarCorreioDeVoz();

        IPod iPod = new IPod();
        iPod.selecionarMusica();
        iPod.tocarMusica();
        iPod.aumentarVolume();
        iPod.diminuirVolume();
        iPod.pausarMusica();

        Safari navegador = new Safari();
        navegador.conectarInternet();
        navegador.exibirPagina("https://www.github.com/galvagni81/");
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://github.com/digitalinnovationone/");
        navegador.fecharPagina();

        IPhone iPhone = new IPhone();

        // Chamando as funcoes de Reprodutor Musical
        iPhone.selecionarMusica();
        iPhone.tocarMusica();
        iPhone.aumentarVolume();
        iPhone.diminuirVolume();
        iPhone.pausarMusica();

        // Chamando as funcoes de Navegador de Internet
        iPhone.conectarInternet();
        iPhone.exibirPagina("https://github.com/");
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
        iPhone.fecharPagina();
        
        // Chamando as funcoes de Telefone
        iPhone.atenderLigacao();
        iPhone.selecionarContato();
        iPhone.fazerLigacao();
        iPhone.iniciarCorreioDeVoz();
        
    }
}
