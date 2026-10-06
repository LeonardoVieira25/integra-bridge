public class SeguroFabrica {

    private SeguroFabrica() {
    }

    private static final SeguroFabrica instancia = new SeguroFabrica();

    public static SeguroFabrica getInstancia() {
        return instancia;
    }

    public Seguro criarSeguro(String tipo) {
        Object objeto = this.criar("Seguro", tipo);
        if (!(objeto instanceof Seguro)) {
            throw new IllegalArgumentException("Tipo de seguro inválido");
        }
        return (Seguro) objeto;
    }

    public Assistencia criarAssistencia(String tipo) {
        Object objeto = this.criar("Assistencia", tipo);
        if (!(objeto instanceof Assistencia)) {
            throw new IllegalArgumentException("Tipo de assistência inválido");
        }
        return (Assistencia) objeto;
    }

    private Object criar(String prefixo, String tipo) {
        try {
            Class<?> classe = Class.forName(prefixo + tipo);
            return classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException(prefixo + " inexistente: " + tipo);
        }
    }

}
