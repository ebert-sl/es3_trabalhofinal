package InterfaceSegregationPrinciple.Violado;

public class Guerreiro implements AcoesPersonagens{
    private String name;

    public Guerreiro(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void atacar() {
        System.out.println("Atacando corpo-a-corpo");
    }

    public void soltarFeitico() {
        System.out.println("Não é possivel soltar feitiços");
    }
}
