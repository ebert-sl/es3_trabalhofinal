package LiskovSubstitutionPrinciple.Violado;

public class FolhaPersonagem {
    private String name;
    private int level;

    public FolhaPersonagem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void atacar() {
        System.out.println( getName() + " está realizando um ataque");
    }
}
