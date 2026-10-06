public abstract class Contrato {
    protected Seguro seguro;
    protected Assistencia assistencia;

    public Contrato(FabricaAbstrata fabricaAbstrata) {
        this.seguro = fabricaAbstrata.criarSeguro();
        this.assistencia = fabricaAbstrata.criarAssistencia();
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void setAssistencia(Assistencia assistencia) {
        this.assistencia = assistencia;
    }

    public abstract double calcularPremio();
    public abstract double calcularValor();

    public double calcularTotal() {
        return this.calcularPremio() + this.calcularValor();
    }

}
