package dispositivo;

import model.ReprodutorMusical;

public class IPod implements ReprodutorMusical {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no iPod...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada no iPod.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no iPod.");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume do iPod aumentado em +1.");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Volume do iPod reduzido em -1.");
    }
}
