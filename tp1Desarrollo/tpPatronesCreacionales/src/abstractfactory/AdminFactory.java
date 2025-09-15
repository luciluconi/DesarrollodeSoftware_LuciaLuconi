package abstractfactory;

public class AdminFactory implements AbstractFactory{
    public InterfazUI crearInterfaz() {
        return new AdminUI();
    }
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioExpress();
    }
}
