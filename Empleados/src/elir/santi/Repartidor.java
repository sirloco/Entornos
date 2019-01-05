package elir.santi;

public class Repartidor extends Empleado{

    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {

        super(nombre, edad, salario);
        this.zona = zona;
    }

    public boolean plus(){
        boolean activado = false;
        if (this.edad < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            this.salario += Empleado.plus;
            activado = true;
        }
        return activado;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
