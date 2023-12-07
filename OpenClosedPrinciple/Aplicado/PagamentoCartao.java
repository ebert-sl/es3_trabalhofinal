package OpenClosedPrinciple.Aplicado;

public class PagamentoCartao implements MetodoPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão: R$" + valor);
    }
}
