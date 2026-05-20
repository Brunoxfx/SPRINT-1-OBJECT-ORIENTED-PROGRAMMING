package model;
public class TrechoRodovia {
    private final String rodovia;
    private final double quilometroInicial;
    private final double quilometroFinal;
    private double nivelVegetacao;
    private EquipeManutencao equipeManutencao;

    public TrechoRodovia(String rodovia, double quilometroInicial, double quilometroFinal, double nivelVegetacao) {
        if (rodovia == null || rodovia.isBlank()) {
            throw new IllegalArgumentException("A rodovia deve ser informada.");
        }

        if (quilometroFinal <= quilometroInicial) {
            throw new IllegalArgumentException("O quilometro final deve ser maior que o inicial.");
        }

        this.rodovia = rodovia;
        this.quilometroInicial = quilometroInicial;
        this.quilometroFinal = quilometroFinal;
        setNivelVegetacao(nivelVegetacao);
    }

    public void registrarCrescimento(double taxa) {
        if (taxa < 0) {
            throw new IllegalArgumentException("A taxa de crescimento nao pode ser negativa.");
        }

        setNivelVegetacao(nivelVegetacao + taxa);
    }

    public boolean verificarCriticidade(double limiteCritico) {
        if (limiteCritico < 0) {
            throw new IllegalArgumentException("O limite critico nao pode ser negativo.");
        }

        return nivelVegetacao >= limiteCritico;
    }

    public void associarEquipeManutencao(EquipeManutencao equipeManutencao) {
        if (equipeManutencao == null) {
            throw new IllegalArgumentException("A equipe de manutencao deve ser informada.");
        }

        this.equipeManutencao = equipeManutencao;
    }

    public String obterDescricao() {
        return rodovia + " KM " + formatarQuilometro(quilometroInicial) + " ao " + formatarQuilometro(quilometroFinal);
    }

    public String getRodovia() {
        return rodovia;
    }

    public double getQuilometroInicial() {
        return quilometroInicial;
    }

    public double getQuilometroFinal() {
        return quilometroFinal;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }

    public void setNivelVegetacao(double nivelVegetacao) {
        if (nivelVegetacao < 0) {
            throw new IllegalArgumentException("O nivel da vegetacao nao pode ser negativo.");
        }

        this.nivelVegetacao = nivelVegetacao;
    }

    public EquipeManutencao getEquipeManutencao() {
        return equipeManutencao;
    }

    private String formatarQuilometro(double quilometro) {
        if (quilometro == Math.floor(quilometro)) {
            return String.valueOf((int) quilometro);
        }

        return String.valueOf(quilometro);
    }
}
