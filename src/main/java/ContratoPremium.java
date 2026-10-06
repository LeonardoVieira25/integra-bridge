public class ContratoPremium extends Contrato {
    public ContratoPremium(FabricaAbstrata fabricaAbstrata) {
        super(fabricaAbstrata);
    }

    @Override
    public double calcularPremio() {
        return seguro.calcularPremio() * 1.5;
    }

    @Override
    public double calcularValor() {
        return assistencia.calcularValor() * 0.5;
    }
}
