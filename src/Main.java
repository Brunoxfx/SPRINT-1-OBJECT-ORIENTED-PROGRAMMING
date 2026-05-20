
import model.EquipeManutencao;
import model.TrechoRodovia;

import java.util.List;

public class Main {
    private static final double LIMITE_VEGETACAO_CRITICA = 30.0;

    public static void main(String[] args) {
        TrechoRodovia trechoSerra = new TrechoRodovia("BR-116", 10, 15, 10);
        TrechoRodovia trechoVale = new TrechoRodovia("SP-348", 40, 45, 22);

        trechoSerra.registrarCrescimento(5);
        trechoVale.registrarCrescimento(13);

        List<TrechoRodovia> trechosMonitorados = List.of(trechoSerra, trechoVale);
        EquipeManutencao equipeRocada = new EquipeManutencao("Equipe Alfa", 4, "rocada mecanizada");

        TrechoRodovia trechoCritico = encontrarTrechoMaisCritico(trechosMonitorados);
        if (trechoCritico.verificarCriticidade(LIMITE_VEGETACAO_CRITICA)) {
            trechoCritico.associarEquipeManutencao(equipeRocada);
        }

        System.out.println("Monitoramento de vegetacao em rodovias");
        System.out.println("--------------------------------------");

        for (TrechoRodovia trecho : trechosMonitorados) {
            System.out.printf(
                    "%s | vegetacao: %.1f cm | status: %s%n",
                    trecho.obterDescricao(),
                    trecho.getNivelVegetacao(),
                    trecho.verificarCriticidade(LIMITE_VEGETACAO_CRITICA) ? "CRITICO" : "normal"
            );
        }

        System.out.println();
        if (trechoCritico.getEquipeManutencao() != null) {
            System.out.println("Prioridade de atendimento:");
            System.out.println(trechoCritico.obterDescricao() + " recebeu " + trechoCritico.getEquipeManutencao().obterResumo());
        } else {
            System.out.println("Nenhum trecho ultrapassou o limite critico de vegetacao.");
        }
    }

    private static TrechoRodovia encontrarTrechoMaisCritico(List<TrechoRodovia> trechosMonitorados) {
        if (trechosMonitorados == null || trechosMonitorados.isEmpty()) {
            throw new IllegalArgumentException("Informe ao menos um trecho monitorado.");
        }

        TrechoRodovia trechoMaisCritico = trechosMonitorados.get(0);
        for (TrechoRodovia trecho : trechosMonitorados) {
            if (trecho.getNivelVegetacao() > trechoMaisCritico.getNivelVegetacao()) {
                trechoMaisCritico = trecho;
            }
        }

        return trechoMaisCritico;
    }
}
