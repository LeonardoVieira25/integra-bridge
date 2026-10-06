public class FabricaMoto implements FabricaAbstrata {
    public Seguro criarSeguro() {
        return SeguroFabrica.getInstancia().criarSeguro("Moto");
    }
}
