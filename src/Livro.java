public class Livro {

    private String nome;
    private String resumo;
    private double preco;
    private int paginas;
    private String autor;
    private Editora editora;
    private TipoCapaEnum tipoCapa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getResumo() {
        return resumo;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public double getPreco() {
        return preco;
    }

    public void pegarPaginas(int paginas){
        if (paginas <= 0)
            System.out.println("Paginas inválidas");
        else
            this.paginas = paginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Livro(String nome, double preco) {
        this.nome = nome; // This é a referência aos atributos
        this.preco = preco;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preço: " + preco);
        System.out.println("Páginas: " + paginas);
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de Capa: " + tipoCapa);
        if(temEditora())
            System.out.println("Editora:" +  editora.nome);

        System.out.println("-------");
    }

    void aplicarDesconto(double percentual) {
        if (percentual > 0.3)
            System.out.println("Desconto não permitido");
        else
        preco = preco - (preco * percentual);
    }

    boolean temEditora() {
        if(editora==null)
            return false;
        else
            return true;
    }

    void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}
