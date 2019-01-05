package elir.santi;

public class Main {

    public static void main(String[] args) {


        Producto[] productos = new Producto[10];

        productos[0] = new Perecedero("pipa", 1.32, 10);
        productos[1] = new Perecedero("uva", 5.34, 3);
        productos[2] = new Perecedero("pera", 2.64, 4);
        productos[3] = new Perecedero("pepino", 5.23, 2);
        productos[4] = new Perecedero("melon", 2.10, 1);

        productos[5] = new NoPerecedero("nueces", 5.32, "seco");
        productos[6] = new NoPerecedero("cacahuete", 12.5, "seco");
        productos[7] = new NoPerecedero("coco", 2.31, "tropical");
        productos[8] = new NoPerecedero("sal", 4.32, "marino");
        productos[9] = new NoPerecedero("azucar", 3.13, "dulce");

        double total = 0;
        for (int i = 0; i < productos.length; i++) {

            System.out.format("%s a %.2f€\n",productos[i].getNombre(),productos[i].calcular(5));

            total += productos[i].calcular(5);
        }

        System.out.format("Precio Total %.2f",total);
    }
}
