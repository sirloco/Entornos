package elir.santi;

public class Cuenta {

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {

        if (cantidad > 0) {

            this.cantidad += cantidad;
        }

    }

    public void retirar(double cantidad) {

        this.cantidad = this.cantidad - cantidad < 0 ? 0 : this.cantidad - cantidad;

    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
