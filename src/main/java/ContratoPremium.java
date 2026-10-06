public class ContratoPremium extends Contrato {
    public ContratoPremium(FabricaAbstrata fabricaAbstrata) {
        super(fabricaAbstrata);
    }

    @Override
    public double calcularPremio() {
        return seguro.calcularPremio() * 1.5;
    }
}
