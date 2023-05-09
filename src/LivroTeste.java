public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "O Hobbit";
        meuLivro.preco = 50.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.preco = 36.99;
        livroFavorito.autor = "Dan Brown";

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
