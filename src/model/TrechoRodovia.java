package model;

public class TrechoRodovia {
    private String rodovia;
    private int quilometroInicial;
    private int quilometroFinal;
    private double nivelVegetacao;
    private EquipeManutencao equipeManutencao;

    public TrechoRodovia(String rodovia, int quilometroInicial, int quilometroFinal, double nivelVegetacao) {
        if (rodovia == null || rodovia.trim().isEmpty()) {
            this.rodovia = "Rodovia nao informada";
        } else {
            this.rodovia = rodovia;
        }

        this.quilometroInicial = quilometroInicial;
        this.quilometroFinal = quilometroFinal;
        setNivelVegetacao(nivelVegetacao);
    }

    public void registrarCrescimento(double taxa) {
        if (taxa > 0) {
            setNivelVegetacao(nivelVegetacao + taxa);
        }
    }

    public boolean verificarCriticidade(double limiteCritico) {
        return nivelVegetacao >= limiteCritico;
    }

    public void associarEquipeManutencao(EquipeManutencao equipeManutencao) {
        if (equipeManutencao != null) {
            this.equipeManutencao = equipeManutencao;
        }
    }

    public String obterDescricao() {
        return rodovia + " KM " + quilometroInicial + " ao " + quilometroFinal;
    }

    public String getRodovia() {
        return rodovia;
    }

    public int getQuilometroInicial() {
        return quilometroInicial;
    }

    public int getQuilometroFinal() {
        return quilometroFinal;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }

    public void setNivelVegetacao(double nivelVegetacao) {
        if (nivelVegetacao < 0) {
            this.nivelVegetacao = 0;
        } else {
            this.nivelVegetacao = nivelVegetacao;
        }
    }

    public EquipeManutencao getEquipeManutencao() {
        return equipeManutencao;
    }
}
