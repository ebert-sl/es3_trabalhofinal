package InterfaceSegregationPrinciple.Violado;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorfinn");
        Mago bruxo = new Mago("Dumbledore");

        guerreiro.atacar();
        guerreiro.soltarFeitico();
        bruxo.atacar();
        bruxo.soltarFeitico();
    }
}
