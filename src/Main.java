public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Auto audi = new Auto("Audi", "A7 coupe", 2025, 3);
        audi.mostrarDetalles();
        audi.mostrarDetalles("~ Carro de lujo\n");
        Moto ducati = new Moto("Ducati", "Panigle V4", 2024, "Deportiva");
        ducati.mostrarDetalles();
        ducati.mostrarDetalles("~ Incluye Kit deportivo\n");
    }
}