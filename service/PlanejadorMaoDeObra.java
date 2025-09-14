package ProjetoEngProcesso.service;

import ProjetoEngProcesso.model.PostoDeTrabalho;
import java.util.List;

public class PlanejadorMaoDeObra {
    
    public int calcularOperadoresNecessarios(PostoDeTrabalho posto, int volumePlanejado) {
        double tempoTotalPorUnidade = posto.calcularTempoTotal();
        if (tempoTotalPorUnidade <= 0) return 0;

        double jornada = 480.0; // minutos
        return (int) Math.ceil((volumePlanejado * tempoTotalPorUnidade) / jornada);
    }

    public void calcularParaLinha(List<PostoDeTrabalho> listaPostos, int volumePlanejado) {
        for (PostoDeTrabalho posto : listaPostos) {
            int operadores = calcularOperadoresNecessarios(posto, volumePlanejado);
            System.out.println("Posto: " + posto.getNome() + " - Operadores necessários: " + operadores);
        }
    }
}
