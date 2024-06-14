public class Iphone implements ReprodutorMusical, AparelhoTelefonico , NavegadorInternet {
    private String modelo;
    private String versaoSO;

    public Iphone(String modelo, String versaoSO) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersaoSO() {
        return versaoSO;
    }

    public void setVersaoSO(String versaoSO) {
        this.versaoSO = versaoSO;
    }

    // ReprodutorMusical methods
    @Override
    public void tocar() {

        System.out.println("Tocando musica..");
    }
    @Override
    public void pausar() {

        System.out.println("Pausando musica..");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("Selecionando musica Skyfall ");
    }


    // AparelhoTelefonico methods

    public void Ligar(String numero) {
        System.out.println("Ligando para "+ numero + " ...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz...");
    }

    // NavegadorInternet methods

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
// Método main para executar a classe
public void main(String[] args) {
    Iphone meuIphone = new Iphone("iPhone 1", "IOS 1.0");

    // Testando funcionalidades do reprodutor musical

    meuIphone.SelecionarMusica();
    meuIphone.tocar();
    meuIphone.pausar();

    // Testando funcionalidades do aparelho telefônico

    meuIphone.Ligar("123-6879");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    // Testando funcionalidades do navegador de internet

    meuIphone.exibirPagina("http://www.google.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();
}
