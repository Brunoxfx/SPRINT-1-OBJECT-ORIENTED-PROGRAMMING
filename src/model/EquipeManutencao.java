package model;

public class EquipeManutencao {
    private final String nome;
    private final int quantidadeIntegrantes;
    private final String especialidade;

    public EquipeManutencao(String nome, int quantidadeIntegrantes, String especialidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome da equipe deve ser informado.");
        }

        if (quantidadeIntegrantes <= 0) {
            throw new IllegalArgumentException("A equipe deve ter pelo menos um integrante.");
        }

        if (especialidade == null || especialidade.isBlank()) {
            throw new IllegalArgumentException("A especialidade deve ser informada.");
        }

        this.nome = nome;
        this.quantidadeIntegrantes = quantidadeIntegrantes;
        this.especialidade = especialidade;
    }

    public String obterResumo() {
        return nome + " (" + quantidadeIntegrantes + " integrantes, " + especialidade + ")";
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeIntegrantes() {
        return quantidadeIntegrantes;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
