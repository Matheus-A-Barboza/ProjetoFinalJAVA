public class Show extends Evento{

    public Show(String nome, String nomeRazao, int quantidadeIngressos, double valor) {
        super(nome, nomeRazao, quantidadeIngressos, valor);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getQuantidadeIngressos() {
        return super.getQuantidadeIngressos();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setQuantidadeIngressos(int quantidadeIngressos) {
        super.setQuantidadeIngressos(quantidadeIngressos);
    }

    @Override
    public double getValor() {
        return super.getValor();
    }


}