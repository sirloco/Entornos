package elir.santi;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Mikel",3);


        cuenta.ingresar(150000);

        cuenta.retirar(50000);

        System.out.println(cuenta.getCantidad());
    }
}
