package classes;

public class Fornecedor extends Pessoa {
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("CPF: " + this.CNPJ);
    }
}
