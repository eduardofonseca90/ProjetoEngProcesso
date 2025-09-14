package ProjetoEngProcesso.service;

import ProjetoEngProcesso.model.Operacao;
import java.util.List;

public class Cronoanalisador {
    
    public void registrarTempos(Operacao operacao, List<Double> temposObservados) {
        operacao.setTempos(temposObservados);
        operacao.calcularMedia();
        operacao.calcularTempoPadrao();
    }

    public void gerarRelatorio(List<Operacao> operacoes) {
        System.out.println("----- Relatório de Tempo Padrão -----");
        for (Operacao op : operacoes) {
            System.out.println("Operação: " + op.getNome() + " (" + op.getTipo() + ")");
            System.out.println("Tempo Médio: " + op.getTempoMedio());
            System.out.println("Tempo Padrão: " + op.getTempoPadrao());
            System.out.println("Tempos Observados: " + op.getTempos());
            System.out.println("------------------------------------");
        }
    }

}
