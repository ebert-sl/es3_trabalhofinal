package SingleResponsibilityPrinciple.Aplicado;

public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ebert");
        ServicoCompra servicoCompra = new ServicoCompra();
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        servicoCompra.realizarCompra(usuario, 1000, calculadoraDesconto);
    }
}
