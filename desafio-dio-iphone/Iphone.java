// Classe iPhone que implementa as três interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroDeSerie;

    // Construtor
    public iPhone(String modelo, String numeroDeSerie) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
    }

    // Implementação dos métodos das interfaces ReprodutorMusical
    public void tocar() {
        // Implementação para tocar música
    }

    public void pausar() {
        // Implementação para pausar música
    }

    public void selecionarMusica() {
        // Implementação para selecionar música
    }

    // Implementação dos métodos das interfaces AparelhoTelefonico
    public void ligar() {
        // Implementação para fazer chamadas
    }

    public void atender() {
        // Implementação para atender chamadas
    }

    public void iniciarCorreioVoz() {
        // Implementação para iniciar correio de voz
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina() {
        // Implementação para exibir página na internet
    }

    public void adicionarNovaAba() {
        // Implementação para adicionar nova aba no navegador
    }

    public void atualizarPagina() {
        // Implementação para atualizar página na internet
    }
}
