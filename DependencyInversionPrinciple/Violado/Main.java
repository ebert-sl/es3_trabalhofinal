package DependencyInversionPrinciple.Violado;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, 10.0, "01/10/2023", "em processamento", "Marcos");
        PedidoService pedidoService = new PedidoService();
        pedidoService.realizarPagamento(pedido);
    }
}
