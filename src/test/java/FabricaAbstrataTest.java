import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FabricaAbstrataTest {

    @Test
    void fabricaDeCarroDeveCriarFamiliaDeCarro() {
        FabricaAbstrata fabrica = new FabricaCarro();
        assertEquals(SeguroCarro.class, fabrica.criarSeguro().getClass());
        assertEquals(AssistenciaCarro.class, fabrica.criarAssistencia().getClass());
    }

    @Test
    void fabricaDeMotoDeveCriarFamiliaDeMoto() {
        FabricaAbstrata fabrica = new FabricaMoto();
        assertEquals(SeguroMoto.class, fabrica.criarSeguro().getClass());
        assertEquals(AssistenciaMoto.class, fabrica.criarAssistencia().getClass());
    }
}
