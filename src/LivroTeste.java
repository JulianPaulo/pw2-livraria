public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Hobbit", 9.99 );
        /*meuLivro.nome = "O Hobbit";*/

        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora1 = new Editora();
        editora1.nome = "Editora Erika";
        editora1.email = "edErica@erica.com.br";
        meuLivro.setEditora(editora1);

        meuLivro.aplicarDesconto(0.2);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O Código da Vinci", 27.90);
        /*livroFavorito.nome = "O Código Da Vinci";*/
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");

        Editora editora2 = new Editora();
        editora2.nome = "Editora Erika";
        editora2.email = "edErica@erica.com.br";
        meuLivro.setEditora(editora2);
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();
    }

}
