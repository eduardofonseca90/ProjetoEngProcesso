package ProjetoEngProcesso.model;
import java.util.List;

public class Operacao extends ElementoProducao{
    private List<Double> tempos;
    private double tempoMedio;
    private double tempoPadrao;
    private TipoOperacao tipo;

    public Operacao(String nome, TipoOperacao tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public Operacao(String nome, TipoOperacao tipo, List<Double> tempos) {
        this(nome, tipo);
        this.tempos = tempos;
    }

    @Override
    public double calcularTempoTotal() {
        return calcularTempoPadrao();
    }

    public double calcularMedia() {
        if (tempos == null || tempos.isEmpty()) return 0.0;
        double soma = 0;
        for (double t : tempos) soma += t;
        tempoMedio = soma / tempos.size();
        return tempoMedio;
    }

    public double calcularTempoPadrao() {
        if (tempoMedio == 0) calcularMedia();
        tempoPadrao = tempoMedio * 1.1; //10% de tolerância (fadiga)
        return tempoPadrao;
    }

    public List<Double> getTempos() { return tempos; }
    public void setTempos(List<Double> tempos) { this.tempos = tempos; }
    public double getTempoMedio() { return tempoMedio; }
    public double getTempoPadrao() { return tempoPadrao; }
    public TipoOperacao getTipo() { return tipo; }
    public void setTipo(TipoOperacao tipo) { this.tipo = tipo; }
}
