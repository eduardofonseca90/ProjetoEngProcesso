package ProjetoEngProcesso.model;

public abstract class ElementoProducao {
    protected String nome;

    public ElementoProducao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularTempoTotal();
}
