package exe3;

public class Fita {
    private String titulo;

    public Fita(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double calcularValor(int diasAlugada) {
        return 0;
    }

    public int calcularPontos(int diasAlugada) {
        return 0;
    }
}

class FitaNormal extends Fita {
    public FitaNormal(String titulo)
    {
        super(titulo);
    }

    @Override
    public double calcularValor(int diasAlugada) {
        double valor = 2;
        if (diasAlugada > 2)
        {
            valor += (diasAlugada - 2) * 1.5;
        }
        return valor;
    }

    @Override
    public int calcularPontos(int diasAlugada) {
        return 1;
    }
}

class FitaLancamento extends Fita {
    public FitaLancamento(String titulo)
    {
        super(titulo);
    }

    @Override
    public double calcularValor(int diasAlugada) {
        return diasAlugada * 3;
    }

    @Override
    public int calcularPontos(int diasAlugada) {
        if (diasAlugada > 1)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
}

class FitaInfantil extends Fita {
    public FitaInfantil(String titulo)
    {
        super(titulo);
    }

    @Override
    public double calcularValor(int diasAlugada) {
        double valor = 1.5;
        if (diasAlugada > 3)
        {
            valor += (diasAlugada - 3) * 1.5;
        }
        return valor;
    }

    @Override
    public int calcularPontos(int diasAlugada) {
        return 1;
    }
}
