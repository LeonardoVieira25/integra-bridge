public class FabricaMoto implements FabricaAbstrata {
    public Seguro criarSeguro() {
        return SeguroFabrica.getInstancia().criarSeguro("Moto");
    }

    public Assistencia criarAssistencia() {
        return SeguroFabrica.getInstancia().criarAssistencia("Moto");
    }
}
