
public class Main {
    public static void main(String[] args) {
        Contrato contratoBasico = new ContratoBasico(new FabricaCarro());
        System.out.println(contratoBasico.calcularPremio());

        Contrato contratoPremium = new ContratoPremium(new FabricaCarro());
        System.out.println(contratoPremium.calcularPremio());
    }
}
