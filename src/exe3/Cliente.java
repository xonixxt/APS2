package exe3;
import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        double total = 0;
        int pontos = 0;
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + nome + "\n");

        for (Aluguel aluguel : alugueis) {
            double valor = aluguel.calcularValor();
            int pontosAluguel = aluguel.calcularPontos();

            resultado.append("\t")
                    .append(aluguel.getFita().getTitulo())
                    .append("\t")
                    .append(valor)
                    .append("\n");

            total += valor;
            pontos += pontosAluguel;
        }

        resultado.append("Valor total devido: ").append(total).append("\n");
        resultado.append("Você ganhou ").append(pontos).append(" pontos de alugador frequente");

        return resultado.toString();
    }
}
