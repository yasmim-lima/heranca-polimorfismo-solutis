public class EnsinoMedio extends EnsinoBasico{

    public EnsinoMedio(String nome, String codigoFuncional, String nomeEscola) {
        super(nome, codigoFuncional, nomeEscola);
    }
    @Override
    public double calcularRendaTotal() {
        return getRendaBase() + (50.0/100.0) * super.getRendaBase();
    }
}
