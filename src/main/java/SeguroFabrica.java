public class SeguroFabrica {
    private SeguroFabrica() {
    }

    private static SeguroFabrica instancia = new SeguroFabrica();

    public static SeguroFabrica getInstancia() {
        return instancia;
    }

    public Seguro criarSeguro(String tipo) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Seguro" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de seguro inexistente");
        }
        if (!(objeto instanceof Seguro)) {
            throw new IllegalArgumentException("Tipo de seguro inválido");
        }
        return (Seguro) objeto;
    }

}
