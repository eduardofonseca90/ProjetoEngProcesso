package ProjetoEngProcesso.model;

import java.util.ArrayList;
import java.util.List;

public class LinhaDeProducao implements Calculavel {
    private String nome;
    private List<PostoDeTrabalho> listaDePostos;
    private double eficienciaGlobal;

    public LinhaDeProducao(String nome) {
        this.nome = nome;
        this.listaDePostos = new ArrayList<>();
    }

    public void adicionarPosto(PostoDeTrabalho posto) {
        listaDePostos.add(posto);
    }

    @Override
    public double calcularTempoTotal() {
        double total = 0.0;
        for (PostoDeTrabalho posto : listaDePostos) {
            total += posto.calcularTempoTotal();
        }
        return total;
    }

    @Override
    public double calcularEficiencia() {
        if (listaDePostos.isEmpty()) return 0.0;

        double soma = 0.0;
        for (PostoDeTrabalho posto : listaDePostos) {
            soma += posto.calcularEficiencia();
        }

        eficienciaGlobal = soma / listaDePostos.size();
        return eficienciaGlobal;
    }

    public PostoDeTrabalho identificarGargalo() {
        if (listaDePostos.isEmpty()) return null;

        PostoDeTrabalho gargalo = listaDePostos.get(0);
        for (PostoDeTrabalho posto : listaDePostos) {
            if (posto.calcularTempoTotal() > gargalo.getTempoTotal()) {
                gargalo = posto;
            }
        }
        return gargalo;
    }

    public String getNome() { return nome; }
    public List<PostoDeTrabalho> getListaDePostos() { return listaDePostos; }
    public double getEficienciaGlobal() { return eficienciaGlobal; }

}

