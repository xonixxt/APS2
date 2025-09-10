package exe2;

public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }
}
