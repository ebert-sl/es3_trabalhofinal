package InterfaceSegregationPrinciple.Aplicado;

public class Mago implements podeAtacar, soltaFeitico {
    private String nome;

    public Mago(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void atacar() {
        System.out.println("Atacando corpo-a-corpo");
    }

    public void lancaFeitico() {
        System.out.println("Soltando feitiço");
    }
}
