public abstract class Evento {
    private String nome;
    private int quantidadeIngressos;
    private String nomeRazao;
    private double valor;

    public Evento(String nome, String nomeRazao, int quantidadeIngressos, double valor) {
        this.nome = nome;
        this.nomeRazao = nomeRazao;
        this.quantidadeIngressos = quantidadeIngressos;
        this.valor = valor;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }


    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

}