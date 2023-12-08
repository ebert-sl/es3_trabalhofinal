package DependencyInversionPrinciple.Aplicado;

public class Pedido {
    private int id;
    private double valor;
    private String data;
    private String status;
    private String cliente;
    
    public Pedido(int id, double valor, String data, String status, String cliente) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
}
