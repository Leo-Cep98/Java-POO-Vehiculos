public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        if (numPuertas <= 5 && numPuertas >= 3) {
            this.numPuertas = numPuertas;
        } else {
            System.out.println("Error ingresa un numero valido de puertas");
        }

    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.printf("Número de puertas: %d\n", this.numPuertas);
    }

    public void mostrarDetalles(String extra) {
        this.mostrarDetalles();
        System.out.println(extra);
    }
}