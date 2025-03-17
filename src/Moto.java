public class Moto extends Vehiculo {
    private String tipo;

    public Moto(String marca, String modelo, int anio, String tipo) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.printf("Tipo: %s\n", this.tipo);
    }

    public void mostrarDetalles(String extra) {
        this.mostrarDetalles();
        System.out.println(extra);
    }
}