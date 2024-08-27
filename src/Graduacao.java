public class Graduacao extends EnsinoMedio {
    String nomeUniversidade;

    public Graduacao(String nome, String codigoFuncional, String nomeEscola, String nomeUniversidade) {
        super(nome, codigoFuncional, nomeEscola);
        this.nomeUniversidade = nomeUniversidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + super.getRendaBase();
    }
}
