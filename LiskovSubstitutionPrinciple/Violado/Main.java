package LiskovSubstitutionPrinciple.Violado;

public class Main {
    public static void main(String[] args) {
        FolhaPersonagem guerreiro = new FolhaPersonagem("Ark", 22);
        Mago bruxo = new Mago("Merlin", 99);

        guerreiro.atacar();
        bruxo.atacar();
    }
}