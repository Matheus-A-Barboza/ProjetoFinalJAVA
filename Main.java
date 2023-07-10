import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Informe seu nome: ");
            String nome = input.nextLine().toUpperCase();

            System.out.println("Informe seu CPF: ");
            String cpf = input.nextLine();

            System.out.println("Informe seu email: ");
            String email = input.nextLine().toUpperCase();

            Usuario usuario = new Usuario(nome, cpf, email);

            Show evento1 = new Show("O Bom da Ilha", "Darazaha", 10, 150);
            Encontro evento2 = new Encontro("Reconecte-se", "Encontro dos Hippies", 5, 80);

            System.out.println("Eventos disponíveis:");
            System.out.println("1. " + evento1.getNome() + ". Banda: " + evento1.getNomeRazao() + " - Quantidade de ingressos disponíveis: " + evento1.getQuantidadeIngressos() + ". Valor: R$" + evento1.getValor());
            System.out.println("2. " + evento2.getNome() + ". Tipo de Encontro: " + evento2.getNomeRazao() + " - Quantidade de ingressos disponíveis: " + evento2.getQuantidadeIngressos() + ". Valor: R$" + evento2.getValor());

            System.out.println("Informe o número do evento desejado: ");
            int numeroEvento = input.nextInt();

            Evento eventoSelecionado;
            if (numeroEvento == 1) {
                eventoSelecionado = evento1;
                boolean quantidadeValida = false;
                int quantidadeIngressosDesejada = 0;

                while (!quantidadeValida) {
                    System.out.println("Informe a quantidade de ingressos desejada: ");
                    quantidadeIngressosDesejada = input.nextInt();
                    for (int i = 0; i < quantidadeIngressosDesejada; i++) {
                        Ingresso ingresso = new Ingresso(eventoSelecionado);
                        usuario.getIngressos().add(ingresso);
                    }
                    if (quantidadeIngressosDesejada <= eventoSelecionado.getQuantidadeIngressos()) {
                        quantidadeValida = true;

                        eventoSelecionado.setQuantidadeIngressos(eventoSelecionado.getQuantidadeIngressos() - quantidadeIngressosDesejada);
                        System.out.println("Obrigado por comprar conosco, " + usuario.getNome() + ". Seus " + quantidadeIngressosDesejada +
                                " ingressos para o Evento: " + evento1.getNomeRazao() + ", foram enviados para o email: " + usuario.getEmail() + ", no valor de: R$" + evento1.getValor() * quantidadeIngressosDesejada);
                        System.out.println("Aproveite seus ingressos para o Evento: " + evento1.getNome());
                    } else {
                        System.err.println("A quantidade escolhida excede a disponível");
                    }
                }

            } else if (numeroEvento == 2) {
                eventoSelecionado = evento2;
                boolean quantidadeValida = false;
                int quantidadeIngressosDesejada = 0;

                while (!quantidadeValida) {
                    System.out.println("Informe a quantidade de ingressos desejada: ");
                    quantidadeIngressosDesejada = input.nextInt();
                    for (int i = 0; i < quantidadeIngressosDesejada; i++) {
                        Ingresso ingresso = new Ingresso(eventoSelecionado);
                        usuario.getIngressos().add(ingresso);
                    }
                    if (quantidadeIngressosDesejada <= eventoSelecionado.getQuantidadeIngressos()) {
                        quantidadeValida = true;

                        eventoSelecionado.setQuantidadeIngressos(eventoSelecionado.getQuantidadeIngressos() - quantidadeIngressosDesejada);
                        System.out.println("Obrigado por comprar conosco, " + usuario.getNome() + ". Seus " + quantidadeIngressosDesejada +
                                " ingressos para o Evento: " + evento2.getNomeRazao() + ", foram enviados para o email: " + usuario.getEmail() + ", no valor de: R$" + evento2.getValor() * quantidadeIngressosDesejada);
                        System.out.println("Aproveite seus ingressos para o Evento: " + evento2.getNome());
                    } else {
                        System.err.println("A quantidade escolhida excede a disponível");
                    }
                }
            } else {
                System.out.println("Evento inválido");
                return;
            }
        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao tentar processar seu pedido: " + e.getMessage());
            return;
        }


    }

}