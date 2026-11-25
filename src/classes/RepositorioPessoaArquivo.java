package classes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoaArquivo implements RepositorioPessoa{
    public int salvar(Pessoa pessoa){
        System.out.println("Salvando pessoa no FILE");
        return 1;
    }

    public List<Pessoa> listar(){
        System.out.println("listando pessoas do FILE");
        return new ArrayList<Pessoa>();
    }
    public boolean editar(int id, Pessoa pessoa){
        System.out.println("Editando uma pessoa no FILE");
        return true;
    }
    public boolean remover(int id){
        System.out.println("Removendo uma pessoa no FILE");
        return true;
    }
}
