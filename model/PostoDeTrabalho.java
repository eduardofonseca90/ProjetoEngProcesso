package ProjetoEngProcesso.model;

import java.util.ArrayList;
import java.util.List;

public class PostoDeTrabalho extends ElementoProducao implements Calculavel {
    private List<Operacao> listaOperacoes;
    private double tempoTotal;

    public PostoDeTrabalho(String nome) {
        super(nome);
        this.listaOperacoes = new ArrayList<>();
    }

    public void adicionarOperacao(Operacao operacao) {
        listaOperacoes.add(operacao);
    }

    @Override
    public double calcularTempoTotal() {
        tempoTotal = 0.0;
        for (Operacao op : listaOperacoes) {
            tempoTotal += op.calcularTempoPadrao();
        }
        return tempoTotal;
    }

    @Override
    public double calcularEficiencia() {
        if (listaOperacoes.isEmpty()) return 0.0;

        double somaMedia = 0.0;
        for (Operacao op : listaOperacoes) {
            somaMedia += op.getTempoMedio();
        }

        if (tempoTotal == 0) calcularTempoTotal();
        return somaMedia / tempoTotal;
    }

    public List<Operacao> getListaOperacoes() { return listaOperacoes; }
    public double getTempoTotal() { return tempoTotal; }
}

