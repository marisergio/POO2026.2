package classes;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String email, String telefone, String cargo){
        super(nome, email, telefone);
        this.cargo = cargo;
    }

    public void imprimir(){
        System.out.println("FUNCIONÁRIO");
        super.imprimir();
        System.out.println("Cargo: "+this.cargo);
    }
}
