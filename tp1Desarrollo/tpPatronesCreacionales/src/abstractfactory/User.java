package abstractfactory;

public class User {
    private InterfazUI interfaz;
    private MetodoEnvio metodoEnvio;

    public User(AbstractFactory factory) {
        this.interfaz = factory.crearInterfaz();
        this.metodoEnvio = factory.crearMetodoEnvio();
    }

    public void iniciarSesion(){
        interfaz.mostrar();
        metodoEnvio.enviar();
    }
}
