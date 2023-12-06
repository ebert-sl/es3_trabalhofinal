package InterfaceSegregationPrinciple.Aplicado;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorfinn");
        Mago bruxo = new Mago("Dumbledore");

        guerreiro.atacar();
        bruxo.atacar();
        bruxo.lancaFeitico();
    }
}
