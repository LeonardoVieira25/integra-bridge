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

}
