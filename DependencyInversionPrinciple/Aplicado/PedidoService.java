package DependencyInversionPrinciple.Aplicado;

public class PedidoService {
    private ProcessadorDePagamento processadorDePagamento;

    public PedidoService(ProcessadorDePagamento processadorDePagamento) {
        this.processadorDePagamento = processadorDePagamento;
    }
    public void realizarPagamento(Pedido pedido){
        processadorDePagamento.processarPagamento(pedido);
    }
    
}
