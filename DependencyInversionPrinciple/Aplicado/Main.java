package DependencyInversionPrinciple.Aplicado;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, 10.0, "01/10/2023", "em processamento", "Marcos");
        ProcessadorDePagamento processadorDePagamento = new PagamentoService();
        PedidoService pedidoService = new PedidoService(processadorDePagamento);
        pedidoService.realizarPagamento(pedido);
    }
}
