public class FabricaCarro implements FabricaAbstrata {
    public Seguro criarSeguro() {
        return SeguroFabrica.getInstancia().criarSeguro("Carro");
    }
}
