package patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {
        for (int i = 0 ; i<10 ; i++){

            ConexionDBSingleton con = ConexionDBSingleton.getInstance();

            //Compruebo que siempre imprime la misma instancia
            System.out.println("con = " + con);
        }
    }
}
