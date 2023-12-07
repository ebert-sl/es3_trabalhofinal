package OpenClosedPrinciple.Aplicado;

public class App {
    public static void main(String[] args) {
        MetodoPagamento cartao = new PagamentoCartao();
        MetodoPagamento boleto = new PagamentoBoleto();

        Pagamento pagamento1 = new Pagamento(cartao);
        Pagamento pagamento2 = new Pagamento(boleto);

        pagamento1.realizarPagamento(1000);
        pagamento2.realizarPagamento(2000);
    }
}
