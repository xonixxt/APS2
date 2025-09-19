/*
7a) Os riscos de implementar dessa forma são que RelatorioFinanceiro está assumindo responsabilidades que
pertencem a Funcionario, acessando diretamente seus dados para calcular bônus e descontos.
Isso causa inveja de dados e
quebra o encapsulamento, já que a lógica de negócio da classe Funcionario está fora

1. Usamos a refatoração do Move Method de Cliente para Aluguel porque tava acontecendo inveja de dados já que
cliente precisava acessar dados tanto de fita quanto de aluguel.java para fazer calculos que não eram
da responsabilidade.
2. Usamos a refatoração de substituir o código de tipo por subclasses na Fita porque o cálculo de valor e
pontos estava espalhado em Cliente e Aluguel, que precisavam verificar o código da fita usando switch.
Isso gerava dependência de dados internos da Fita e dificultava adicionar novos tipos, então
cada tipo de Fita agora calcula sozinho seu valor e pontos, eliminando a necessidade de switch.
*/
package exe3;

public class Locadora {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Raul");

        Fita fita1 = new FitaNormal("Matrix");
        Fita fita2 = new FitaInfantil("Toy Story");
        Fita fita3 = new FitaLancamento("Oppenheimer");

        cliente.adicionaAluguel(new Aluguel(fita1, 3));
        cliente.adicionaAluguel(new Aluguel(fita2, 4));
        cliente.adicionaAluguel(new Aluguel(fita3, 2));

        System.out.println(cliente.extrato());
    }
}
