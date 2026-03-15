public class Habitos {
    // Atributos de la clase Habitos
    String nombre;
    String tipo;
    int duracion;
    boolean completado;
    
    // Constructor para inicializar los atributos del hábito
    public Habitos(String nombre, String tipo, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
        this.completado = false;
    }
    // metodo para marcar el habito como completado
    public void marcarCompletado() {
        completado = true;
    }
    // metodo para cambiar la duracion del habito 
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    // Método para mostrar la información del hábito en consola
    public void mostrarHabito() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Duracion: " + duracion);
        System.out.println("Completado: " + completado);
        System.out.println("--------------------");
    }
}