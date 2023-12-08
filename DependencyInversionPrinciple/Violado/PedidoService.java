package DependencyInversionPrinciple.Violado;

public class PedidoService {
    private PagamentoService pagamentoService;

    public PedidoService() {
		pagamentoService = new PagamentoService();
	}
    
    public void realizarPagamento(Pedido pedido) {
        pagamentoService.processarPagamento(pedido);
    }
}
