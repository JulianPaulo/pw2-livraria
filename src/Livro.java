public class Livro {

    String nome;
    String resumo;
    double preco;
    int paginas;
    String autor;

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preço: " + preco);
        System.out.println("Páginas: " + paginas);
        System.out.println("Autor: " + autor);
        System.out.println("-------");
    }

    void aplicarDesconto(int percentual) {
        if (percentual >= 0.35) {
            System.out.println("Não e possivel aplicar desconto");
        } else if (!impresso && percentual > 0.15) {
            System.out.println("Erro");
        } else {
            preco = preco - (preco * percentual);
            System.out.println("Aplicar Desconto: " + preco );
        }
    }


}
