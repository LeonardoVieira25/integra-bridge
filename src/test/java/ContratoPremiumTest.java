import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContratoPremiumTest {

    @Test
    void testCalcularPremioPremiumMoto() {
        ContratoPremium contratoPremiumMoto = new ContratoPremium(new FabricaMoto());
        double premio = contratoPremiumMoto.calcularPremio();
        assertEquals(750.0, premio, 0.001);
    }

    @Test
    void testCalcularPremioPremiumCarro() {
        ContratoPremium contratoPremiumCarro = new ContratoPremium(new FabricaCarro());
        double premio = contratoPremiumCarro.calcularPremio();
        assertEquals(1500.0, premio, 0.001);
    }

    @Test
    void testCalcularValorPremiumMoto() {
        ContratoPremium contratoPremiumMoto = new ContratoPremium(new FabricaMoto());
        double valor = contratoPremiumMoto.calcularValor();
        assertEquals(50.0, valor, 0.001);
        assertEquals(800.0, contratoPremiumMoto.calcularTotal(), 0.001);
    }

    @Test
    void testCalcularValorPremiumCarro() {
        ContratoPremium contratoPremiumCarro = new ContratoPremium(new FabricaCarro());
        double valor = contratoPremiumCarro.calcularValor();
        assertEquals(100.0, valor, 0.001);
        assertEquals(1600.0, contratoPremiumCarro.calcularTotal(), 0.001);
    }

}
