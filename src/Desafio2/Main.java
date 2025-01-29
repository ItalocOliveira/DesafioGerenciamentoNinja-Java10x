package Desafio2;

public class Main {
    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 17, TipoHabilidade.NINJUTSU);
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado itachi = new NinjaAvancado("Itachi Uchiha", 21, TipoHabilidade.GENJUTSU, "Mangekyou Sharingan");
        itachi.mostrarInformacoes();
        itachi.executarHabilidade();

    }
}

