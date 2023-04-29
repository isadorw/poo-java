public class Main {
  public static void main(String[] args) {
    // 2 objetos
    FilmeApp filme1 = new FilmeApp();
    FilmeApp filme2 = new FilmeApp();

    // preenchendo atributos
    filme1.titulo = "Notting Hill";
    filme1.ano = 1999;
    filme1.duracao = 124;
    filme1.genero = "Romance";
    filme1.diretor = "Roger Michell";

    filme2.titulo = "The Devil Wears Prada";
    filme2.ano = 2006;
    filme2.duracao = 109;
    filme2.genero = "Comedy Romance";
    filme2.diretor = "David Frankel";

    // exceutando metodos
    System.out.println("Informacoes do filme 1:");
    filme1.exibirInformacoes();

    System.out.println("Informacoes do filme 2:");
    filme2.exibirInformacoes();
  }
}