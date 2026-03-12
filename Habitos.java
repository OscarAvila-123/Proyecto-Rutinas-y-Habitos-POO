public class Habitos {

    String nombre;
    String tipo;
    int duracion;
    boolean completado;

    public Habitos(String nombre, String tipo, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
        this.completado = false;
    }

    public void marcarCompletado() {
        completado = true;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarHabito() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Duracion: " + duracion);
        System.out.println("Completado: " + completado);
        System.out.println("--------------------");
    }
}