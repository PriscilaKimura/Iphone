public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String numeroLigacao;
    private String urlAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
    }

    @Override
    public void ligar(String numero) {
        this.numeroLigacao = numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe seu recado, apos o sinal!");
    }

    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova pagina!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");
    }
}