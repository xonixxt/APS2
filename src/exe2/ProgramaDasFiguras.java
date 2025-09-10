package exe2;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        Losango l1 = new Losango(4.0, 5.0);
        Losango l2 = new Losango(3.0, 6.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        // Imprime todas as figuras
        gerente.imprimeFiguras();

        // Área total
        System.out.println("Área total de todas as figuras: " + gerente.getAreaTotal());

        // Maior área
        System.out.println("Maior área cadastrada: " + gerente.getMaiorAreaDeFigura());
    }
}
