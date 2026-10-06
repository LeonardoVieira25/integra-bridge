public abstract class Contrato {
    protected Seguro seguro;

    public Contrato(FabricaAbstrata fabricaAbstrata) {
        this.seguro = fabricaAbstrata.criarSeguro();
    }

    public abstract double calcularPremio();

}
