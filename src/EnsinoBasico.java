public class EnsinoBasico extends Funcionario{
    String nomeEscola;

    public EnsinoBasico(String nome, String codigoFuncional, String nomeEscola) {
        super(nome, codigoFuncional);
        this.nomeEscola = nomeEscola;
    }

    @Override
    public double calcularRendaTotal() {
        return getRendaBase() + (10.0/100.0) * super.getRendaBase();
    }
}
