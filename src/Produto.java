import java.util.ArrayList;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int codigo;
    private String tipo;    //tipo = salgado ou doce

    private static ArrayList<Produto> produtos = new ArrayList<>();

    public Produto(String nome, String descricao, double preco, int codigo, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        if (preco<0){
            throw new IllegalArgumentException();
        }
        else {
            this.preco = preco;
        }
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Código: " + getCodigo());
        System.out.println("Tipo: " + getTipo());
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void excluirProduto() {
        System.out.println("Produto " + getNome() + " excluído.");
    }
}


/*System.out.print("Digite o nome do cliente que deseja excluir: ");
                    String nomeExcluir = teclado.nextLine();
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
                    }*/
