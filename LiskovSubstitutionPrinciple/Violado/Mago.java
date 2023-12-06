package LiskovSubstitutionPrinciple.Violado;

public class Mago extends FolhaPersonagem {
    public Mago(String name, int level) {
        super(name, level);
    }

    @Override
    public void atacar() {
        System.out.println( getName() + " está realizando um ataque mágico");
    }
}
