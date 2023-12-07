package OpenClosedPrinciple.Violado;

public class App {
    public static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento(MetodoPagamento.CARTAOCREDITO);
        Pagamento pagamento2 = new Pagamento(MetodoPagamento.BOLETO);

        pagamento1.realizarPagamento(1000);
        pagamento2.realizarPagamento(2000);
    }
}
