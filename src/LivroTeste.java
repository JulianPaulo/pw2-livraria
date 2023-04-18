public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Hobbit", 9.99 );
        /*meuLivro.nome = "O Hobbit";*/

        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora();
        editora1.nome = "Editora Erika";
        editora1.email = "edErica@erica.com.br";
        meuLivro.editora = editora1;

        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O Código da Vinci", 27.90);
        /*livroFavorito.nome = "O Código Da Vinci";*/
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.autor = "Dan Brown";

        Editora editora2 = new Editora();
        editora2.nome = "Editora Erika";
        editora2.email = "edErica@erica.com.br";
        meuLivro.editora = editora2;
        livroFavorito.tipoCapa = TipoCapaEnum.PERSONALIZADA;

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();
    }

}
