public class Ingressos extends Usuario {

    private double preco = 32;
    private int quantidade = 100;

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getNome_usuario() {
        return super.getNome_usuario();
    }

    @Override
    public String toString() {
        return "Ingressos{" + "preco=" + preco + ", quantidade=" + quantidade + '}';
    }




}
