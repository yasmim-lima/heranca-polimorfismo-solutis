public class Vendedor extends Funcionario implements Comissao {

    public Vendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularComissao() {
        return 250.00;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + calcularComissao();
    }
}
