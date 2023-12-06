package SingleResponsibilityPrinciple.Aplicado;

public class ServicoCompra {
    public void realizarCompra(Usuario usuario, double valor, 
    CalculadoraDesconto calculadoraDesconto) {
        System.out.println("Compra realizada por " + usuario.getNome() + 
        " no valor de R$" + valor);
        double totalCompras = usuario.getTotalCompras();
        usuario.setTotalCompras(totalCompras += valor);

        double desconto = calculadoraDesconto.calcularDesconto(usuario);

        if (desconto > 0) {
            System.out.println("Desconto aplicado: R$" + desconto);
            usuario.setTotalCompras(totalCompras -= desconto);
            System.out.println("Valor com desconto: R$" + (valor - desconto));
        }
    }
}
