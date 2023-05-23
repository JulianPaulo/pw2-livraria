public class RegistroVendas {

    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void Adicionar(Livro livro){
        System.out.println("Livro Adicionado: " + livro.getNome());
        livro.aplicarDesconto(0.10);
        total = total + livro.getPreco();
    }

}
