package InterfaceSegregationPrinciple.Aplicado;

public class Guerreiro implements podeAtacar{
    private String nome;

    public Guerreiro(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void atacar() {
        System.out.println("Atacando corpo-a-corpo");
    }
}
