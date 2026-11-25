import classes.*;

Scanner javain = new Scanner(System.in);

void main() {
    var produtos = new ArrayList<Produto>();
    var pessoas = new ArrayList<Pessoa>();
    RepositorioPessoa repositorioPessoa = new RepositorioPessoaBD();

    int opcao;

    do {
        menu();
        opcao = javain.nextInt();
        javain.nextLine();
        switch (opcao) {
            case 1:
                System.out.println("cadastrar produto");
                produtos.add(cadastrarProduto());
                break;
            case 2:
                System.out.println("listar produtos");
                for (Produto p : produtos){
                    System.out.println("Código: "+p.getCodigo());
                    System.out.println("Nome: "+p.getNome());
                    System.out.println("Preco: "+p.getPreco());
                }
                break;
            case 3:
                System.out.println("CADASTRAR CLIENTE");
                Pessoa pessoa = cadastrarCliente();
                repositorioPessoa.salvar(pessoa);
                pessoas.add(pessoa);
                break;
            case 4:
                System.out.println("LISTAR PESSOAS");
                for(Pessoa p : pessoas){
                    p.imprimir();
                }
                break;
            case 5:
                System.out.println("CADASTRAR FUNCIONARIO");
                pessoas.add(cadastrarFuncionario());
                break;
            case 6:
                System.out.println("ESCOLHA A FONTE DE ARMAZENAMENTO");
                System.out.println("1 - Banco de Dados");
                System.out.println("2 - Arquivo");
                int tipoArmazenamento = javain.nextInt();
                javain.nextLine();
                if (tipoArmazenamento == 1){
                    repositorioPessoa = new RepositorioPessoaBD();
                }else {
                    repositorioPessoa = new RepositorioPessoaArquivo();
                }
                pessoas.add(cadastrarFuncionario());
                break;
            case 0:
                System.out.println("sair");
                break;
            default:
                System.out.println("opcao invalida");
        }
    }while (opcao!=0);

}

public void menu(){
    System.out.println("MENU");
    System.out.println("1 - Cadastrar produtos");
    System.out.println("2 - Listar produtos");
    System.out.println("3 - Cadastrar cliente");
    System.out.println("4 - Listar Pessoas");
    System.out.println("5 - Cadastrar Funcionario");
    System.out.println("6 - Escolha o mecanismo de armazenamento");
    System.out.println("0 - SAIR");
}

public Produto cadastrarProduto(){
    System.out.println("Digite o código: ");
    int codigo = javain.nextInt();
    javain.nextLine();
    System.out.println("Digite o nome: ");
    String nome = javain.nextLine();
    System.out.println("Digite o preco: ");
    double preco = javain.nextDouble();
    javain.nextLine();

    Produto produto = new Produto(codigo, nome, preco);
    return produto;
}

public Cliente cadastrarCliente(){
    System.out.println("Digite o nome: ");
    String nome = javain.nextLine();
    System.out.println("Digite o E-mail: ");
    String email = javain.nextLine();
    System.out.println("Digite o Telefone ");
    String telefone = javain.nextLine();
    System.out.println("Digite o CPF ");
    String cpf = javain.nextLine();
    return new Cliente(cpf, nome, email, telefone);

}

public Funcionario cadastrarFuncionario(){
    System.out.println("Digite o nome: ");
    String nome = javain.nextLine();
    System.out.println("Digite o E-mail: ");
    String email = javain.nextLine();
    System.out.println("Digite o Telefone ");
    String telefone = javain.nextLine();
    System.out.println("Digite o Cargo ");
    String cargo = javain.nextLine();
    return new Funcionario(nome, email, telefone, cargo);

}

