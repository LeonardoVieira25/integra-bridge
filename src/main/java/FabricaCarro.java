public class FabricaCarro implements FabricaAbstrata {
    public Seguro criarSeguro() {
        return SeguroFabrica.getInstancia().criarSeguro("Carro");
    }

    public Assistencia criarAssistencia() {
        return SeguroFabrica.getInstancia().criarAssistencia("Carro");
    }
}
