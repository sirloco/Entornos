package elir.santi;

public class Comercial extends Empleado {

    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public boolean plus() {
        boolean activado = false;
        if (this.edad > 30 && this.comision > 200) {
            this.salario += Empleado.plus;
            activado = true;
        }
        return activado;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
