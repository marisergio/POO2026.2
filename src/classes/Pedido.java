package classes;

import java.util.Date;

public class Pedido {
    private int codigo;
    private Date data;
    private String status;
    private Cliente cliente;

    public Pedido(int codigo, String status) {
        this.codigo = codigo;
        this.status = status;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }
}
