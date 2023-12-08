package DependencyInversionPrinciple.Aplicado;

public class PagamentoService implements ProcessadorDePagamento {
    public void processarPagamento(Pedido pedido) {
        System.out.println("Processando pagamento do pedido " + pedido.getId() + "\n" +
        "Requisição enviada para a operadora.\n" +
        "Reposta da operadora: Pagamento autorizado!");
    }
}
