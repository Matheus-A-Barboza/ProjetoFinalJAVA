import java.util.Scanner;

public class Cosnnect {
    public void sistema() {
        Scanner input = new Scanner(System.in);

        Usuario u = new Usuario();
        Ingressos i = new Ingressos();

        System.out.println("------------------------------");
        System.out.println("-----BEM VINDO A COSNNECT-----");
        System.out.println("------------------------------");

        System.out.println("Você já possui cadastro?");
        String entrar = input.nextLine();

        while (true) {

            if (entrar.equalsIgnoreCase("SIM")) {
                System.out.println("Digite o usuário:");
                String entrar_user = input.nextLine();

                if (u.usuario.contains(entrar_user)) {
                    u.setNome_usuario(entrar_user);
                } else if (!u.usuario.contains(entrar_user)) {
                    System.out.println("Usuario não cadastrado. Cadastre-se ou tente novamente!");
                    continue;
                }

                System.out.println("Digite seu email:");
                String entrar_email = input.nextLine();
                if (u.email_cadastrado.contains(entrar_email)){
                    u.setEmail(entrar_email);
                }else if (!u.email_cadastrado.contains(entrar_email)){
                    System.err.println("Email não cadastrado. Cadastre-se ou tente novamente!");
                    continue;
                }


                System.out.println("Digite sua senha:");
                String entrar_senha = input.nextLine();
                if(u.senha_cadastrado.contains(entrar_senha)){
                    System.out.println("Entrou com sucesso!");
                }

            } else if (entrar.equalsIgnoreCase("NAO")) {
                System.out.println("Cadastre seu email:");
                String cadastrar_email = input.nextLine();

                if (u.email_cadastrado.contains(cadastrar_email)) {
                    System.out.println("Email já cadastrado.");
                    continue;
                } else {
                    u.email_cadastrado.add(cadastrar_email);
                    u.setEmail(cadastrar_email);
                    System.out.println("Email cadastrado com sucesso!");
                }

                System.out.println("Cadastre sua senha:");
                String cadastrar_senha = input.nextLine();
                u.setSenha(cadastrar_senha);
                u.senha_cadastrado.add(cadastrar_senha);

                System.out.println("Como você se chama?:");
                String cadastrar_nome = input.nextLine();
                u.usuario.add(cadastrar_nome);
                u.setNome_usuario(cadastrar_nome);
                System.out.println("Usuario cadastrado com Sucesso!");
            }

            System.out.println("Olá, " + u.getNome_usuario() + ". Bem vindo!");
            System.out.println("Estes são os eventos disponiveis que ocorreram próximos à você:\n" +
                    "1 - Anime Gakuen: Palhoça\n" +
                    "2 - AnimeFest: São José\n" +
                    "3 - ComicCon: São José");

            while (true) {
                System.out.println("Qual evento lhe interessa?: ");
                Integer escolha_evento = input.nextInt();

                switch (escolha_evento) {
                    case 1:
                        System.out.println("Você selecionou Anime Gakuen\n" +
                                "1 - Entrada Inteira: R$32,00. Disponiveis: " + i.getQuantidade());
                        break;
                    case 2:
                        System.out.println("Você selecionou AnimeFest\n" +
                                "1 - Entrada Inteira: R$32,00. Disponiveis: " + i.getQuantidade());
                        break;
                    case 3:
                        System.out.println("Você selecionou ComicCon\n" +
                                "1 - Entrada Inteira: R$32,00. Disponiveis: " + i.getQuantidade());
                        break;

                }

                System.out.println("Quantos ingressos você deseja?: ");
                Integer qnt_ingresso = input.nextInt();


                if (u.getNome_usuario() == null) {
                    System.err.println("Impossivel completar sua compra! Entre com sua conta e tente novamente");
                    break;

                } else if (qnt_ingresso <= i.getQuantidade()) {
                    System.out.println("Ingressos reservados");
                    int resultado = (i.getQuantidade() - qnt_ingresso);
                    int valor = (int) (i.getPreco() * qnt_ingresso);
                    System.out.println(resultado + " ingressos disponiveis");
                    System.out.println(u.getNome_usuario() + ", foram enviados " + qnt_ingresso +
                            " ingressos para seu email: " + u.getEmail() + ", no valor de: R$" + valor +
                            ".\nTenha um bom Evento!!");


                } else if (qnt_ingresso >= i.getQuantidade()) {
                    System.out.println("Numero de ingressos excede ingressos." +
                            " Quantidade de ingressos são: " + i.getQuantidade());

                }break;
            }break;

        }
    }

}
