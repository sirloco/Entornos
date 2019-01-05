package elir.santi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //repartidor
        System.out.print("Nombre repartidor: ");
        String nombreRepartidor = br.readLine();

        System.out.print("Edad repartidor: ");
        int edadRepartidor = Integer.parseInt(br.readLine());

        System.out.print("Salario repartidor: ");
        double salarioRepartidor = Double.parseDouble(br.readLine());

        System.out.print("Zona repartidor: ");
        String zona = br.readLine();

        Repartidor repartidor = new Repartidor(nombreRepartidor, edadRepartidor, salarioRepartidor, zona);

        Comercial comercial = new Comercial("santi", 34, 1000.0, 201.0);

        System.out.println(repartidor);
        System.out.println(comercial);

        if (comercial.plus())
            System.out.format("Asignado plus a %s\n",comercial.getNombre());

        System.out.println(comercial);
    }
}
