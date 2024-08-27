public class Supervisor extends Funcionario implements Comissao {

    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularComissao() {
        return 600.00;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + calcularComissao();
    }
}
