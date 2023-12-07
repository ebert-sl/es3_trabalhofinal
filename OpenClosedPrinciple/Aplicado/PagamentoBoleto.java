package OpenClosedPrinciple.Aplicado;

public class PagamentoBoleto implements MetodoPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com boleto: R$" + valor);
    }
}
