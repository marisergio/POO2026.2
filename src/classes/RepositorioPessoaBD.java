package classes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoaBD implements RepositorioPessoa{
    public int salvar(Pessoa pessoa){
        System.out.println("Salvando pessoa no BD");
        return 1;
    }

    public List<Pessoa> listar(){
        System.out.println("listando pessoas do bd");
        return new ArrayList<Pessoa>();
    }
    public boolean editar(int id, Pessoa pessoa){
        System.out.println("Editando uma pessoa no bd");
        return true;
    }
    public boolean remover(int id){
        System.out.println("Removendo uma pessoa no bd");
        return true;
    }
}
