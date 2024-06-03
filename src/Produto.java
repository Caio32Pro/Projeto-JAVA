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

    public static double maiorValor(){
        double i=0;
        for (Produto p : produtos){
            if (p.getPreco()>i){
                i = p.getPreco();
            }
        }
        return i;
    }

    public static void maiorValor2(){
        for (Produto p : Produto.getProdutos()){
            if (p.getPreco()==maiorValor()){
                System.out.println("O produto de maior valor é: " + p.getNome() + " | " + p.getPreco());
            }
        }
    }

    public static double menorValor(){
        double i = Produto.getProdutos().getFirst().getPreco();
        for (Produto p : produtos){
            if (p.getPreco()<i){
                i = p.getPreco();
            }
        }
        return i;
    }

    public static void menorValor2(){
        for (Produto p : Produto.getProdutos()){
            if (p.getPreco()==menorValor()){
                System.out.println("O produto de menor valor é: " + p.getNome() + " | " + p.getPreco());
            }
        }
    }

    public static float mediaProd(){
        float a = 0;
        for (Produto p : produtos){
            a += p.getPreco();
        }
        return a/produtos.size();
    }

    public static double maiorMedia(){
        int a = 0;
        for (Produto p : produtos){
            if (p.getPreco()>mediaProd()){
                a++;
            }
        }
        return a;
    }
}