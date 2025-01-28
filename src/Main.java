import java.util.Scanner;

public class Main extends Uchiha {
    public static void main(String[] args) {

        // Criando um scanner
        Scanner scanner = new Scanner(System.in);

        // Lista dos ninjas disponiveis
        int NUMERO_NINJA_MAX = 5;
        String[][] ninjas = new String[NUMERO_NINJA_MAX][5];

        int opcao = 0;
        int contadorDeEspacosOcupados = 0;

        int ninjaAModificar = 0;
        String novaHabilidade;

        while(opcao != 5){

            // Mostrando o menu na tela
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Exibir informações dos Ninjas");
            System.out.println("3. Atualizar habilidade especial de um Ninja");
            System.out.println("4. Deletar Ninja");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            // Recebendo a opcao do usuário
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Tratamento das opcoes do usuário

            switch (opcao){
                case 1:
                    // Verificando se há espaço para por um novo ninja
                    if(contadorDeEspacosOcupados == 5){
                        System.out.println("Não há espaços para novos Ninjas!");
                        break;
                    } else {
                        for (int i = 0; i < NUMERO_NINJA_MAX; i++) {
                            if(ninjas[i][0] == null){
                                System.out.println(ninjas[i][0]);
                                System.out.println(contadorDeEspacosOcupados);

                                //Recebendo informações do ninja
                                System.out.println("Digite o nome do seu Ninja: ");
                                String nomeNinja = scanner.nextLine();

                                System.out.println("Digite a idade do seu Ninja: ");
                                int idadeNinja = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Digite a habilidade especial do seu ninja: ");
                                String habilidadeEspecial = scanner.nextLine();

                                System.out.println("Digite a missão do seu ninja: ");
                                String missaoNinja = scanner.nextLine();

                                System.out.println("Digite a dificuldade desta missão: ");
                                String dificuldadeMissao = scanner.nextLine();

                                System.out.println("Digite o status atual da missão: ");
                                String statusMissao = scanner.nextLine();

                                // Criando um ninja utilizando classe
                                Uchiha novoUchiha = new Uchiha();
                                novoUchiha.nome = nomeNinja;
                                novoUchiha.idade = idadeNinja;
                                novoUchiha.habilidadeEspecial = habilidadeEspecial;
                                novoUchiha.missao = missaoNinja;
                                novoUchiha.nivelDificuldade = dificuldadeMissao;
                                novoUchiha.statusMissao = statusMissao;

                                // Adicionando Ninja à lista
                                ninjas[i][0] = novoUchiha.nome; // Nome
                                ninjas[i][1] = novoUchiha.idade + ""; // Idade convertida em string
                                ninjas[i][2] = novoUchiha.habilidadeEspecial; // Habilidade especial
                                ninjas[i][3] = novoUchiha.missao; // Missão
                                ninjas[i][4] = novoUchiha.statusMissao; // Status da missão
                                contadorDeEspacosOcupados++;
                                break;

                            }
                        }
                    }
                    break;
                case 2:
                    // Verficando se a lista está vazia
                    if (contadorDeEspacosOcupados == 0){
                        System.out.println("A lista de Ninjas está vazia.");
                    } else {
                        // Exibindo informações dos ninjas disponiveis
                        System.out.println("================== Informações dos Ninjas ==================");
                        for (int i = 0; i < NUMERO_NINJA_MAX; i++) {
                            if (ninjas[i][0] != null) {
                                System.out.println("\n");
                                System.out.println("================== Ninja "  + (i + 1) + " ==================");
                                System.out.println("Nome: " + ninjas[i][0]);
                                System.out.println("Idade: " + ninjas[i][1] + " anos");
                                System.out.println("Habilidade Especial: " + ninjas[i][2]);
                                System.out.println("Missão: " + ninjas[i][3]);
                                System.out.println("Status da missão: " + ninjas[i][4]);
                            }
                        }
                    }
                    break;
                case 3:
                    // Verficando se a lista está vazia
                    if (contadorDeEspacosOcupados == 0){
                        System.out.println("A lista de Ninjas está vazia.");
                    } else {
                        // Mostrando na tela os ninjas disponiveis na lista
                        for (int i = 0; i < NUMERO_NINJA_MAX; i++) {
                            if (ninjas[i][0] != null){
                                System.out.println("================== Ninja "  + (i + 1) + " ==================");
                                System.out.println("Nome: " + ninjas[i][0]);
                                System.out.println("Habilidade Especial: " + ninjas[i][2]);
                            }
                        }
                        // Recebendo a escolha do usuário
                        System.out.println("Escolha o ninja o qual você deseja alterar a habilidade especial: ");
                        ninjaAModificar = scanner.nextInt() - 1;
                        scanner.nextLine();
                        System.out.println("Digite qual será a nova habilidade de " + ninjas[ninjaAModificar][0] + ": ");
                        novaHabilidade = scanner.nextLine();
                        System.out.println(novaHabilidade);
                        // Atualizando a habilidade do ninja de acordo com a escolha do usuário
                        ninjas[ninjaAModificar][2] = novaHabilidade;
                    }
                    break;
                case 4:
                    // Verficando se a lista está vazia
                    if (contadorDeEspacosOcupados == 0){
                        System.out.println("A lista de Ninjas está vazia.");
                    } else {
                        for (int i = 0; i < NUMERO_NINJA_MAX; i++) {
                            // Mostrando na tela os ninjas disponiveis na lista
                            if (ninjas[i][0] != null){
                                System.out.println("================== Ninja "  + (i + 1) + " ==================");
                                System.out.println("Nome: " + ninjas[i][0]);
                                System.out.println("Habilidade Especial: " + ninjas[i][2]);
                            }
                        }
                        // Recebendo a escolha do usuário
                        System.out.println("Escolha qual Ninja deve ser apagado da lista: ");
                        ninjaAModificar = scanner.nextInt() - 1;
                        ninjas[ninjaAModificar][0] = null;
                        ninjas[ninjaAModificar][1] = null;
                        ninjas[ninjaAModificar][2] = null;
                        ninjas[ninjaAModificar][3] = null;
                        ninjas[ninjaAModificar][4] = null;
                        contadorDeEspacosOcupados--;
                    }
                    break;
                case 5:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida. Tente novamente.");
                    break;

            }
        }

        // Fechar o Scanner
        scanner.close();
    }
}
