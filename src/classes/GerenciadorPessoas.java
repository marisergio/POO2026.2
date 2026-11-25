package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoas {
    private RepositorioPessoa repositorioPessoa;
    public GerenciadorPessoas(RepositorioPessoa repositorioPessoa){
        this.repositorioPessoa = repositorioPessoa;
    }

    public int salvar(Pessoa pessoa){
        return this.repositorioPessoa.salvar(pessoa);
    }
    public List<Pessoa> listar(){
        return this.repositorioPessoa.listar();
    }
    public boolean editar(int id, Pessoa pessoa){
        return this.repositorioPessoa.editar(id, pessoa);
    }
    public boolean remover(int id){
        return this.repositorioPessoa.remover(id);
    }
}
