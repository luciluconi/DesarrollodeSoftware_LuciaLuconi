package abstractfactory;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void enviar() {
        System.out.println("Envio Express en 24 horas");
    }
}
