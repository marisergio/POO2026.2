package classes;

import java.util.List;

public interface RepositorioPessoa {
    int salvar(Pessoa pessoa);
    List<Pessoa> listar();
    boolean editar(int id, Pessoa pessoa);
    boolean remover(int id);
}
