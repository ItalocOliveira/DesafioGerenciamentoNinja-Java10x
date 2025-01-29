package Desafio2;

public class NinjaBasico implements Ninja {

    // Iformações do Ninja
    String nome;
    int idade;
    TipoHabilidade habilidade;

    // No args constructor
    public NinjaBasico(){

    }

    // All args constructor
    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes(){
        System.out.println("================= Informações de " + nome + " =================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habilidade: " + habilidade);
    }

    public void executarHabilidade(){
        System.out.println("Eu sou " + nome + ", sou um Ninja básico, e minha habilidade é: " + habilidade + "!\n");
    }
}

