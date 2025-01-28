public class Uchiha extends Ninja{

    String habilidadeEspecial;

    // Mostrar todas as informações do objeto
    public void mostrarInformacoes() {

        System.out.println("================== Informações de " + nome + " ==================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        System.out.println("================================================================");

    }

    // Sharingan ativado, metodo publico
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ", e eu ativei o Sharingan!");
    }

    // Mostrar a habilidade especial
    public void mostrarHabilidaeEspecial() {
        System.out.println("Meu nome é " + nome + ", e minha habilidade especial é: " + habilidadeEspecial + "!");
    }

}
