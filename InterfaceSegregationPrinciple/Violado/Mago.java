package InterfaceSegregationPrinciple.Violado;

public class Mago {
    private String name;

    public Mago(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void atacar() {
        System.out.println("Atacando corpo-a-corpo");
    }

    public void soltarFeitico() {
        System.out.println("Soltando feitiço");
    }
}
