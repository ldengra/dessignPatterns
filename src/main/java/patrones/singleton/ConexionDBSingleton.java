package patrones.singleton;

public class ConexionDBSingleton {

    private static ConexionDBSingleton instancia;

    private ConexionDBSingleton(){
        //aqui debe ir toda la conexion a la base de datos
        System.out.println("Conectandose a la base de datos");
    }

    public static ConexionDBSingleton getInstance(){

        if (instancia == null){
            instancia = new ConexionDBSingleton();
        }

        return instancia;
    }


}
