import java.util.Scanner;
import Exception.IdadeMenorZeroException;
import Exception.EmailErradoException;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente cli1 = new Cliente("Caio".toUpperCase(), "16", "m", "(19) 99837-6306", "caio32823@gmail.com");
        Cliente.getClientes().add(cli1);
        Cliente cli2 = new Cliente("Carla".toUpperCase(), "25", "f", "(19) 91234-5678", "carla@gmail.com");
        Cliente.getClientes().add(cli2);
        Cliente cli3 = new Cliente("Antunes".toUpperCase(), "69", "n/b", "4002-8922", "antunesmatue@gmail.com");
        Cliente.getClientes().add(cli3);

        Funcionario func1 = new Funcionario("Lucas".toUpperCase(), "19", "m", "(19) 97166-9363", "cl203514@g.unicamp.br");
        Funcionario.getFuncionarios().add(func1);
        Funcionario func2 = new Funcionario("Lucila".toUpperCase(), "42", "f", "(15)94585-0780", "coisaricadavo@hotmail.com");
        Funcionario.getFuncionarios().add(func2);
        Funcionario func3 = new Funcionario("Ray".toUpperCase(), "27", "m", "(19)98159-7662", "cl203518@g.unicamp.br");
        Funcionario.getFuncionarios().add(func3);

        Produto prod1 = new Produto("Pão doce".toUpperCase(), "Pão doce com recheio de goiabada".toUpperCase(), 6.99, 1, "doce");
        Produto.getProdutos().add(prod1);
        Produto prod2 = new Produto("Pamonha".toUpperCase(), "doce de milho verde".toUpperCase(), 8.99, 2, "doce");
        Produto.getProdutos().add(prod2);
        Produto prod3 = new Produto("Doritos".toUpperCase(), "Salgadinho da Pepsi'co sabor queijo nacho ".toUpperCase(), 7.99, 3, "salgado");
        Produto.getProdutos().add(prod3);

        System.out.println("\n\nSeja muito bem-vindo(a) à Padaria Universo");
        System.out.println("------------------------------------------");

        String resposta="";
        String busca;

        while (resposta.equals("0")==false) {
            System.out.println("\nMENU DO USUÁRIO\n");
            System.out.println("Cadastrar [A]" +
                               "\nConsultar [B]" +
                               "\nExcluir [C]" +
                               "\nInformações [D]" +
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
                            try {
                                System.out.println("Digite o nome do cliente: ");
                                String nome = teclado.nextLine().toUpperCase();
                                System.out.println("Digite a idade do cliente: ");
                                String idade = teclado.nextLine();
                                if (Integer.parseInt(idade)<=0){
                                    throw new IdadeMenorZeroException();
                                }
                                System.out.println("Digite o sexo do cliente: ");
                                String sexo = teclado.nextLine();
                                System.out.println("Digite o telefone do cliente: ");
                                String numero = teclado.nextLine();
                                System.out.println("Digite o email do cliente: ");
                                String email = teclado.nextLine();
                                if (email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
                                    Cliente cli = new Cliente(nome, idade, sexo, numero, email);
                                    Cliente.getClientes().add(cli);
                                    System.out.println("Cliente cadastrado com sucesso!");
                                }
                                else {
                                    throw new EmailErradoException();
                                }
                            }
                            catch (EmailErradoException e){
                                System.out.println("O email deve terminar com: '@gmail.com' ou '@hotmail.com'");
                            }
                            catch (IdadeMenorZeroException e){
                                System.out.println("A idade não pode ser 0");
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
                                    throw new IdadeMenorZeroException();
                                }
                                System.out.println("Digite o sexo do funcionário: ");
                                String sexo1 = teclado.nextLine();
                                System.out.println("Digite o telefone do funcionário: ");
                                String numero1 = teclado.nextLine();
                                System.out.println("Digite o email do funcionário: ");
                                String email1 = teclado.nextLine();
                                if (email1.endsWith("@gmail.com")||email1.endsWith("@hotmail.com")){
                                    Funcionario func = new Funcionario(nome1, idade1, sexo1, numero1, email1);
                                    Funcionario.getFuncionarios().add(func);
                                    System.out.println("funcionário cadastrado com sucesso!");
                                }
                                else {
                                    throw new EmailErradoException();
                                }
                            }
                            catch (IdadeMenorZeroException e){
                                System.out.println("A idade do funcionário não pode ser menor que 18 anos");
                            }
                            catch (EmailErradoException e){
                                System.out.println("O email deve terminar com: '@gmail.com' ou '@hotmail.com'");
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
                                if (preco==0){
                                    throw new IllegalArgumentException();
                                }
                                else {
                                    teclado.nextLine();
                                    System.out.println("Digite o código do produto: ");
                                    int codigo = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Digite o tipo do produto (doce ou salgado): ");
                                    String tipo = teclado.nextLine();
                                    Produto prod = new Produto(nome2, descricao, preco, codigo, tipo);
                                    Produto.getProdutos().add(prod);
                                    System.out.println("Produto cadastrado com sucesso!");
                                }
                            }
                            catch (IllegalArgumentException e){
                                System.out.println("Produtos não podem ser de graça.");
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
                                    for (Cliente c : Cliente.getClientes()) {
                                        if (c.getNome().startsWith(a)) {
                                            c.exibir();
                                            System.out.println("-------------------------");
                                        }
                                    }

                                break;
                                }
                                case "2": {
                                    for (Cliente c : Cliente.getClientes()) {
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
                                    for (Funcionario f : Funcionario.getFuncionarios()) {
                                        if (f.getNome().startsWith(b)) {
                                            f.exibir();
                                            System.out.println("-------------------------");
                                        }
                                    }
                                break;
                                }
                                case "2": {
                                    for (Funcionario f : Funcionario.getFuncionarios()) {
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
                                    System.out.println("Digite a informação do produto: ");
                                    String c = teclado.nextLine().toUpperCase();
                                    for (Produto p : Produto.getProdutos()) {
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
                                    for (Produto p : Produto.getProdutos()) {
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
                            System.out.print("Digite o email do cliente que deseja excluir: ");
                            String emailExcluir = teclado.nextLine().toUpperCase();
                            boolean encontrado = false;
                            for (Cliente c : Cliente.getClientes()) {
                                if (c.getEmail().equalsIgnoreCase(emailExcluir)) {
                                    Cliente.getClientes().remove(c);
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
                            System.out.print("Digite o email do funcionário que deseja excluir: ");
                            String emailExcluir = teclado.nextLine().toUpperCase();
                            boolean encontrado = false;
                            for (Funcionario f : Funcionario.getFuncionarios()) {
                                if (f.getEmail().equalsIgnoreCase(emailExcluir)) {
                                    Funcionario.getFuncionarios().remove(f);
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
                            System.out.print("Digite o código do produto que deseja excluir: ");
                            int codExcluir = teclado.nextInt();
                            teclado.nextLine();
                            boolean encontrado = false;
                            for (Produto p : Produto.getProdutos()) {
                                if (p.getCodigo() == codExcluir) {
                                    Produto.getProdutos().remove(p);
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
                case "D":{
                    System.out.println("Tela de informações:");
                    System.out.println("Informações dos clientes [1]" +
                                       "\nInformações dos produtos [2]");
                    String info = teclado.nextLine().toUpperCase();
                    switch (info){
                        case "1":{
                            System.out.println("");
                            Cliente.maiorIdade2();
                            Cliente.menorIdade2();
                            System.out.println("Clientes maiores que 60 anos: " + Cliente.mais60());
                            System.out.println("CLientes menores de 18 anos: " + Cliente.menor18());
                            System.out.println("A média das idades dos clientes é: " + Cliente.media());
                            break;
                        }
                        case "2":{
                            System.out.println("");
                            Produto.maiorValor2();
                            Produto.menorValor2();
                            System.out.println("Média dos produtos: " + Produto.mediaProd());
                            System.out.println("Produtos acima da média: " + Produto.maiorMedia());
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