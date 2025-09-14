package ProjetoEngProcesso.app;

import ProjetoEngProcesso.model.ElementoProducao;
import ProjetoEngProcesso.model.LinhaDeProducao;
import ProjetoEngProcesso.model.Operacao;
import ProjetoEngProcesso.model.PostoDeTrabalho;
import ProjetoEngProcesso.model.TipoOperacao;
import ProjetoEngProcesso.service.Cronoanalisador;
import ProjetoEngProcesso.service.PlanejadorMaoDeObra;

import java.util.List;    

public class TesteService {
    public static void main(String[] args) {
        // Criar operações
        Operacao op1 = new Operacao("Montagem", TipoOperacao.MONTAGEM);
        Operacao op2 = new Operacao("Inspeção", TipoOperacao.INSPECAO);
        Operacao op3 = new Operacao("Embalagem", TipoOperacao.EMBALAGEM);

        // Criar postos de trabalho
        PostoDeTrabalho posto1 = new PostoDeTrabalho("Posto A");
        posto1.adicionarOperacao(op1);
        posto1.adicionarOperacao(op2);

        PostoDeTrabalho posto2 = new PostoDeTrabalho("Posto B");
        posto2.adicionarOperacao(op3);

        // Registrar tempos observados
        Cronoanalisador crono = new Cronoanalisador();
        crono.registrarTempos(op1, List.of(10.0, 12.0, 11.0));
        crono.registrarTempos(op2, List.of(5.0, 6.0, 5.5));
        crono.registrarTempos(op3, List.of(8.0, 7.5, 8.5));

        // Gerar relatório de tempos
        crono.gerarRelatorio(List.of(op1, op2, op3));

        // Criar linha de produção
        LinhaDeProducao linha = new LinhaDeProducao("Linha Principal");
        linha.adicionarPosto(posto1);
        linha.adicionarPosto(posto2);

        // Calcular eficiência global e identificar gargalo
        double eficiencia = linha.calcularEficiencia();
        PostoDeTrabalho gargalo = linha.identificarGargalo();

        System.out.println("\n----- Linha de Produção -----");
        System.out.println("Eficiência Global: " + eficiencia);
        System.out.println("Gargalo: " + gargalo.getNome() + " com tempo total " + gargalo.getTempoTotal());

        // Planejar mão de obra
        PlanejadorMaoDeObra planejador = new PlanejadorMaoDeObra();
        int volumePlanejado = 100; // unidades planejadas
        System.out.println("\n----- Planejamento de Mão de Obra -----");
        planejador.calcularParaLinha(linha.getListaDePostos(), volumePlanejado);

        // Comparando tempos por tipo de elementos de produção
        System.out.println("\n----- Comparativo de tempos -----");
        ElementoProducao elem1 = op1;       // referência genérica para uma Operacao
        ElementoProducao elem2 = posto1;    // referência genérica para um PostoDeTrabalho

        System.out.println("Tempo total Operacao: " + elem1.calcularTempoTotal());
        System.out.println("Tempo total PostoDeTrabalho: " + elem2.calcularTempoTotal());
    }
}
