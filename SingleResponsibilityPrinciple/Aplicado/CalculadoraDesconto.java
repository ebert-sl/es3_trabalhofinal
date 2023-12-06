package SingleResponsibilityPrinciple.Aplicado;

public class CalculadoraDesconto {
    private double desconto = 0;

    public double calcularDesconto(Usuario usuario) {
        if (usuario.getTotalCompras() > 1000) {
            desconto = 50;
        }
        return desconto;
    }
}
