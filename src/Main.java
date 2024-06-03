import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("Seja muito bem-vindo(a) à Padaria Universo");
        System.out.println("------------------------------------------");

        String resposta="";
        String busca;

        while (resposta.equals("0")==false) {
            System.out.println("\nMENU DO USUÁRIO\n");
            System.out.println("Cadastrar [A]" +
                               "\nConsultar [B]" +
                               "\nExcluir [C]" +
                               "\nSair [0]");
            resposta = teclado.nextLine().toUpperCase();
            switch (resposta){
                case "A": {
                    System.out.println("Tela de Cadastro: \n");
                    System.out.println("Cliente [1]" +
                            "\nFuncionários [2]" +
                            "\nProdutos [3]");
                    String opcao = teclado.nextLine();
                    switch (opcao) {
                        case "1": {
                            try{
                                System.out.println("Digite o nome do cliente: ");
                                String nome = teclado.nextLine().toUpperCase();
                                System.out.println("Digite a idade do cliente: ");
                                String idade = teclado.nextLine();
                                System.out.println("Digite o sexo do cliente: ");
                                String sexo = teclado.nextLine();
                                System.out.println("Digite o número do cliente: ");
                                String numero = teclado.nextLine();
                                System.out.println("Digite o email do cliente: ");
                                String email = teclado.nextLine();
                                Cliente cli = new Cliente(nome, idade, sexo, numero, email);
                                clientes.add(cli);
                                System.out.println("Cliente cadastrado com sucesso!");
                            }
                            catch(IllegalArgumentException e){
                                System.out.println("O número não podeestar vazio.");
                            }
                        break;
                        }
                        case "2": {
                            try {
                                System.out.println("Digite o nome do funcionário: ");
                                String nome1 = teclado.nextLine().toUpperCase();
                                System.out.println("Digite a idade do funcionário: ");
                                String idade1 = teclado.nextLine();
                                if (Double.parseDouble(idade1) < 18) {
                                    throw new IllegalArgumentException();
                                }
                                else
                                {
                                    System.out.println("Digite o sexo do funcionário: ");
                                    String sexo1 = teclado.nextLine();
                                    System.out.println("Digite o número do funcionário: ");
                                    String numero1 = teclado.nextLine();
                                    System.out.println("Digite o email do funcionário: ");
                                    String email1 = teclado.nextLine();
                                    Funcionario func = new Funcionario(nome1, idade1, sexo1, numero1, email1);
                                    funcionarios.add(func);
                                    System.out.println("funcionário cadastrado com sucesso!");
                                }

                            }
                            catch (IllegalArgumentException e){
                                System.out.println("Insira valores válidos");
                            }
                        break;
                        }
                        case "3": {
                            try{
                                System.out.println("Digite o nome do produto: ");
                                String nome2 = teclado.nextLine().toUpperCase();
                                System.out.println("Digite a descrição do produto: ");
                                String descricao = teclado.nextLine().toUpperCase();
                                System.out.println("Digite o preço do produto: ");
                                double preco = teclado.nextDouble();
                                if (preco<0){
                                    throw new IllegalArgumentException("Produtos não podem ser de graça.");
                                }
                                else {
                                    teclado.nextLine();
                                    System.out.println("Digite o código do produto: ");
                                    int codigo = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Digite o tipo do produto (doce ou salgado): ");
                                    String tipo = teclado.nextLine();
                                    Produto prod = new Produto(nome2, descricao, preco, codigo, tipo);
                                    produtos.add(prod);
                                    System.out.println("Produto cadastrado com sucesso!");
                                }
                            }
                            catch (IllegalArgumentException e){
                                e.getMessage();
                            }
                        break;
                        }
                    }
                    break;
                }
                case "B": {
                    System.out.println("Tela de consulta \n");
                    System.out.println("Cliente [1]" +
                            "\nFuncionários [2]" +
                            "\nProdutos [3]");
                    String respOpc = teclado.nextLine();
                    switch (respOpc) {
                        case "1": {
                            System.out.println("Procurar um cliente [1]" +
                                    "\nMostrar todos cadastrados [2]");
                            String procCli = teclado.nextLine();
                            switch (procCli) {
                                case "1": {
                                    System.out.println("Digite o nome do cliente: ");
                                    String a = teclado.nextLine().toUpperCase();
                                    for (Cliente c : clientes) {
                                        if (c.getNome().startsWith(a)) {
                                            c.exibir();
                                            System.out.println("-------------------------");
                                        }
                                    }
                                break;
                                }
                                case "2": {
                                    for (Cliente c : clientes) {
                                        c.exibir();
                                        System.out.println("-------------------------");
                                    }
                                break;
                                }
                            }
                        break;
                        }
                        case "2": {
                            System.out.println("Procurar um funcionário [1]" +
                                    "\nMostrar todos cadastrados [2]");
                            String procFunc = teclado.nextLine();
                            switch (procFunc) {
                                case "1": {
                                    System.out.println("Digite o nome do funcionário: ");
                                    String b = teclado.nextLine().toUpperCase();
                                    for (Funcionario f : funcionarios) {
                                        if (f.getNome().startsWith(b)) {
                                            f.exibir();
                                            System.out.println("-------------------------");
                                        }
                                    }
                                break;
                                }
                                case "2": {
                                    for (Funcionario f : funcionarios) {
                                        f.exibir();
                                        System.out.println("-------------------------");
                                    }
                                break;
                                }
                            }
                        break;
                        }
                        case "3": {
                            System.out.println("Procurar um produto [1]" +
                                    "\nMostrar todos cadastrados [2]");
                            String procProd = teclado.nextLine();
                            switch (procProd) {
                                case "1": {
                                    System.out.println("Digite a descrição do produto: ");
                                    String c = teclado.nextLine().toUpperCase();
                                    for (Produto p : produtos) {
                                        if (p.getDescricao().startsWith(c)) {
                                            p.exibir();
                                            System.out.println("-------------------------");
                                        } else if (String.valueOf(p.getPreco()
                                        ).startsWith(c)) {
                                            p.exibir();
                                            System.out.println("-------------------------");
                                        } else if (String.valueOf(p.getCodigo()).startsWith(c)) {
                                            p.exibir();
                                            System.out.println("-------------------------");
                                        }
                                    }
                                break;
                                }
                                case "2": {
                                    for (Produto p : produtos) {
                                        p.exibir();
                                        System.out.println("-------------------------");
                                    }
                                break;
                                }
                            }
                        break;
                        }
                    }
                break;
                }
                case "C": {
                    System.out.println("Tela de exclusão \n");
                    System.out.println("Cliente [1]" +
                                       "\nFuncionários [2]" +
                                       "\nProdutos [3]");
                    String exc = teclado.nextLine();
                    switch (exc){
                        case "1":{
                            System.out.print("Digite o nome do cliente que deseja excluir: ");
                            String nomeExcluir = teclado.nextLine().toUpperCase();
                            boolean encontrado = false;
                            for (Cliente c : clientes) {
                                if (c.getNome().equalsIgnoreCase(nomeExcluir)) {
                                    clientes.remove(c);
                                    c.excluirCliente();
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Cliente não encontrado.");
                            }
                            break;
                        }
                        case "2":{
                            System.out.print("Digite o nome do funcionário que deseja excluir: ");
                            String nomeExcluir = teclado.nextLine().toUpperCase();
                            boolean encontrado = false;
                            for (Funcionario f : funcionarios) {
                                if (f.getNome().equalsIgnoreCase(nomeExcluir)) {
                                    funcionarios.remove(f);
                                    f.excluirFuncionario();
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Funcionário não encontrado.");
                            }
                            break;
                        }
                        case "3":{
                            System.out.print("Digite o nome do produto que deseja excluir: ");
                            String nomeExcluir = teclado.nextLine().toUpperCase();
                            boolean encontrado = false;
                            for (Produto p : produtos) {
                                if (p.getNome().equalsIgnoreCase(nomeExcluir)) {
                                    produtos.remove(p);
                                    p.excluirProduto();
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Produto não encontrado.");
                            }
                            break;
                        }
                    }
                    break;
                }
                case "0": {
                    System.out.println("Obrigado por usar nosso sistema");
                    System.exit(0);
                break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        }
    }
}