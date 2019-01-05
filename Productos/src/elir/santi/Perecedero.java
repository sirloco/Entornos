package elir.santi;

public class Perecedero extends Producto {

    private int diasAcaducar;

    public Perecedero(String nombre, double precio, int diasAcaducar) {
        super(nombre, precio);
        this.diasAcaducar = diasAcaducar;
    }

    public double calcular(int cantidad) {

        switch (diasAcaducar) {
            case 1:
                precio /= 4;
                break;
            case 2:
                precio /= 3;
                break;
            case 3:
                precio /= 2;
                break;

        }
        return cantidad * precio;
    }


}
