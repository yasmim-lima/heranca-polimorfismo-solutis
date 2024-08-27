public class Funcionario {
    private static final double RENDA_BASE = 1000.00;
    private String nome;
    private String codigoFuncional;
    private double comissao;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }


    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double getRendaBase() {
        return RENDA_BASE;
    }

    public double calcularRendaTotal() {
        return getRendaBase() + comissao;
    }
}
