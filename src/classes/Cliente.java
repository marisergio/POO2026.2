package classes;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String cpf, String nome, String email,String telefone){
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("CPF: " + this.cpf);
    }


}
