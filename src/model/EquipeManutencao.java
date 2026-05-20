package model;

public class EquipeManutencao {
    private String nome;
    private int quantidadeIntegrantes;
    private String especialidade;

    public EquipeManutencao(String nome, int quantidadeIntegrantes, String especialidade) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Equipe sem nome";
        } else {
            this.nome = nome;
        }

        if (quantidadeIntegrantes <= 0) {
            this.quantidadeIntegrantes = 1;
        } else {
            this.quantidadeIntegrantes = quantidadeIntegrantes;
        }

        if (especialidade == null || especialidade.trim().isEmpty()) {
            this.especialidade = "sem especialidade";
        } else {
            this.especialidade = especialidade;
        }
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
