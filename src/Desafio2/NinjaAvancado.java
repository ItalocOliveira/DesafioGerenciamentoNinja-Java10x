package Desafio2;

public class NinjaAvancado implements Ninja {

    // Iformações do Ninja
    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    // No args constructor
    public NinjaAvancado(){

    }

    // All args constructor
    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes(){
        System.out.println("================= Informações de " + nome + " =================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    public void executarHabilidade(){
        System.out.println("Eu sou " + nome + ", sou um Ninja avançado. Minha habilidade é: " + habilidade + " e minha especialidade é: " + especialidade + "!\n");
    }
}

