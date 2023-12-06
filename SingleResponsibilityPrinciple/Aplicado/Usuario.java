package SingleResponsibilityPrinciple.Aplicado;

public class Usuario {
    private String nome;
    private double totalCompras;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }
}
