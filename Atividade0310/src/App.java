public class App {
    public static void main(String[] args) throws Exception {
        
        Livro livro1 = new Livro("A Historia de Caio", "Caio", "123456", 10);
        Livro livro2 = new Livro("Herança de Jorge", "Jorge", "654321", 5);
        Livro livro3 = new Livro("Eu Também Sou Progressista", "Alessandro", "987654", 2);

        Estoque estoque = new Estoque();

        estoque.adicionarLivro(livro1);
        estoque.adicionarLivro(livro2);
        estoque.adicionarLivro(livro3);

        System.out.println("\nLista de livros: ");
        estoque.listarLivros();

        estoque.atualizarQuantidade("654321", 6);

        System.out.println("\nLista de livros: ");
        estoque.listarLivros();

        estoque.buscarLivro("987654");

        estoque.removerLivro("123456");

        System.out.println("\nLista de livros: ");
        estoque.listarLivros();

        
    }
}
