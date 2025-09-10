package exe2;

public class Losango implements FiguraGeometrica {
    private double diagonal1;
    private double diagonal2;

    public Losango(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculaArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Losango";
    }
}
