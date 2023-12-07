package OpenClosedPrinciple.Violado;

public class Pagamento {
    private MetodoPagamento metodo;

    public Pagamento(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public void realizarPagamento(double valor) {
        switch (metodo) {
            case CARTAOCREDITO:
                System.out.println("Pagamento com cartão: R$" + valor);
                break;
            case BOLETO:
                System.out.println("Pagamento com boleto: R$" + valor);
                break;
            default:
                System.out.println("Método de pagamento não suportado!");
        }
    }
}
