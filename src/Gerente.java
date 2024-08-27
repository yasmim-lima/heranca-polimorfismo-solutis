public class Gerente extends Funcionario implements Comissao {

    public Gerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularComissao() {
        return 1500.00;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + calcularComissao();
    }
}
