package SingleResponsibilityPrinciple.Violado;

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

    public void realizarCompra(double valor) {
        System.out.println("Compra realizada por " + nome + " no valor de R$" + valor);
        totalCompras += valor;

        double desconto = calcularDesconto();
        if (desconto > 0) {
            System.out.println("Desconto aplicado: R$" + desconto);
            totalCompras -= desconto;
            System.out.println("Valor com desconto: R$" + (valor - desconto));
        }
    }

    private double calcularDesconto() {
        double desconto = 0;

        if (totalCompras > 1000) {
            desconto = 50;
        }

        return desconto;
    }
}
