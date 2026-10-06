public class ContratoBasico extends Contrato {
    public ContratoBasico(FabricaAbstrata fabricaAbstrata) {
        super(fabricaAbstrata);
    }

    @Override
    public double calcularPremio() {
        return seguro.calcularPremio();
    }
}
