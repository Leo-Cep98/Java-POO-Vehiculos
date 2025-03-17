public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void mostrarDetalles() {
        System.out.printf("\nLos datos básicos del carro son: \nMarca: %s\nModelo: %s\nAño: %d\n", this.marca, this.modelo, this.anio);
    }

    public void mostrarDetalles(String extra) {
        this.mostrarDetalles();
        System.out.println(extra);
    }
}