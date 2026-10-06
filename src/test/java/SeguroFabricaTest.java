import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SeguroFabricaTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertEquals(SeguroFabrica.getInstancia(), SeguroFabrica.getInstancia());
    }

    @Test
    void deveCriarSeguroDeCarro() {
        Seguro seguro = SeguroFabrica.getInstancia().criarSeguro("Carro");
        assertEquals(SeguroCarro.class, seguro.getClass());
        assertEquals(1000.0, seguro.calcularPremio(), 0.001);
    }

    @Test
    void deveCriarSeguroDeMoto() {
        Seguro seguro = SeguroFabrica.getInstancia().criarSeguro("Moto");
        assertEquals(SeguroMoto.class, seguro.getClass());
        assertEquals(500.0, seguro.calcularPremio(), 0.001);
    }

    @Test
    void deveCriarAssistenciaDeCarro() {
        Assistencia assistencia = SeguroFabrica.getInstancia().criarAssistencia("Carro");
        assertEquals(AssistenciaCarro.class, assistencia.getClass());
        assertEquals(200.0, assistencia.calcularValor(), 0.001);
    }

    @Test
    void deveCriarAssistenciaDeMoto() {
        Assistencia assistencia = SeguroFabrica.getInstancia().criarAssistencia("Moto");
        assertEquals(AssistenciaMoto.class, assistencia.getClass());
        assertEquals(100.0, assistencia.calcularValor(), 0.001);
    }

    @Test
    void deveLancarExcecaoParaSeguroInexistente() {
        assertThrows(IllegalArgumentException.class,
                () -> SeguroFabrica.getInstancia().criarSeguro("Onibus"));
    }

    @Test
    void deveLancarExcecaoParaAssistenciaInexistente() {
        assertThrows(IllegalArgumentException.class,
                () -> SeguroFabrica.getInstancia().criarAssistencia("Onibus"));
    }
}
