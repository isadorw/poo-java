public class FilmeApp {
    // atributos
    String titulo;
    int ano;
    int duracao;
    String genero;
    String diretor;

    // método
    public void exibirInformacoes() {
        System.out.println("Título do filme: " + this.titulo);
        System.out.println("Duração: " + this.duracao + " minutos");
        System.out.println("Ano: " + this.ano);
        System.out.println("Genero: " + this.genero);
        System.out.println("Diretor: " + this.diretor);
    }
}