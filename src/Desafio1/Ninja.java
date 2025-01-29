package Desafio1;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {

        System.out.println("================== Informações de " + nome + " ==================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Missão: " + missao);
        System.out.println("Nivel da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        System.out.println("================================================================");

    }

}
