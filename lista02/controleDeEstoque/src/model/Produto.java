package model;

public class Produto {

    private String nome;
    private int codigo;
    private double valorCusto;
    private double valorVenda;

    public Produto(String nome, int codigo, double valorCusto) {
        this.nome = nome;
        this.codigo = codigo;
        this.valorCusto = valorCusto;
        this.valorVenda = valorCusto + (valorCusto*30/100);
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
        this.valorVenda += valorCusto*30/100;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", codigo=" + codigo + ", valorCusto=" + valorCusto + ", valorVenda=" + valorVenda + '}';
    }
    
    
    
    public String mostraProduto(){
        String rP = "";
        rP += "Cod: "+getCodigo();
        rP += "\nNome: "+getNome();
        rP += "\nValor Custo: "+getValorCusto();
        rP += "\nValor Venda: "+getValorVenda();
        return rP;
    }
    

    

    

}
