public class Empresa {
    private Funcionario[] funcionarios;
    private int count;

    public Empresa(int tamanho) {
        funcionarios = new Funcionario[tamanho];
        count = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (count < funcionarios.length) {
            funcionarios[count++] = funcionario;
        }
    }

    public void calcularCustos() {
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;
        double custoTotal = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularRendaTotal();
            custoTotal = custoTotal + salario;

            if (funcionario instanceof EnsinoBasico) {
                custoBasico += salario;
            } else if (funcionario instanceof EnsinoMedio) {
                custoMedio += salario;
            } else if (funcionario instanceof Graduacao) {
                custoSuperior += salario;
            }
        }

        System.out.println("Custo Total da Empresa: R$ " + custoTotal);
        System.out.println("Custo com Ensino Básico: R$ " + custoBasico);
        System.out.println("Custo com Ensino Médio: R$ " + custoMedio);
        System.out.println("Custo com Graduação: R$ " + custoSuperior);
    }
    public static void main(String[] args) {
        Empresa empresa = new Empresa(10);

        empresa.adicionarFuncionario(new EnsinoBasico("Alice", "0001", "Colegio Arqui"));
        empresa.adicionarFuncionario(new EnsinoBasico("Marina", "0002", "Colegio Master"));
        empresa.adicionarFuncionario(new EnsinoBasico("Valentina", "0003", "Colegio Coesi"));
        empresa.adicionarFuncionario(new EnsinoBasico("Sofia", "0004", "Colegio Amadeus"));

        empresa.adicionarFuncionario(new EnsinoMedio("Felipe", "0005", "Colegio Asas"));
        empresa.adicionarFuncionario(new EnsinoMedio("Lucas", "0006", "Colegio Atheneu"));
        empresa.adicionarFuncionario(new EnsinoMedio("Arthur", "0007", "Colegio Sao Paulo"));
        empresa.adicionarFuncionario(new EnsinoMedio("Maria", "0008", "Colegio SESI"));

        empresa.adicionarFuncionario(new Graduacao("Igor", "0009", "Colegio CEPI", "Universidade Federal de Sergipe"));
        empresa.adicionarFuncionario(new Graduacao("Matheus", "0010", "Colegio CCPA", "Universidade Federal da Bahia"));

        empresa.calcularCustos();
    }

}
