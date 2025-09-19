package exe3;

public class Aluguel {
    private int diasAlugada;
    private Fita fita;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() { return fita; }
    public int getDiasAlugada() { return diasAlugada; }

    // ---- Move Method ----
    public double calcularValor() {
        return fita.calcularValor(diasAlugada);
    }

    public int calcularPontos() {
        return fita.calcularPontos(diasAlugada);
    }
}
