package LiskovSubstitutionPrinciple.Aplicado;

public class Mago extends FolhaPersonagem {
    public Mago(String name, int level) {
        super(name, level);
    }


    public void soltarFeitico() {
        System.out.println( getName() + " está realizando um ataque mágico");
    }
}
