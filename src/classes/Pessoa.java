package classes;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    public Pessoa(){}

    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Telefone: "+this.telefone);
    }
}
