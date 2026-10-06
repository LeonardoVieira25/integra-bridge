import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContratoBasicoTest {
    @Test
    void testCalcularPremioBasicoMoto() {
        ContratoBasico contratoBasicoMoto = new ContratoBasico(new FabricaMoto());
        double premio = contratoBasicoMoto.calcularPremio();
        assertEquals(500.0, premio, 0.001);
    }

    @Test
    void testCalcularPremioBasicoCarro() {
        ContratoBasico contratoBasicoCarro = new ContratoBasico(new FabricaCarro());
        double premio = contratoBasicoCarro.calcularPremio();
        assertEquals(1000.0, premio, 0.001);
    }
}
