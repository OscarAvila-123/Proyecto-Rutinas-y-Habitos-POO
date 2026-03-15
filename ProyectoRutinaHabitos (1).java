public class ProyectoRutinaHabitos {
    // metodo para iniciar el programa
    public static void main(String[] args) {
        // creacion de objetos de la clase Habitos
        Habitos habito1 = new Habitos("Hacer ejercicio", "Salud", 30);
        Habitos habito2 = new Habitos("Estudiar Java", "Estudio", 60);

        // mostrar la informacion de los habitos en consola
        habito1.mostrarHabito();
        habito2.mostrarHabito();

        // actualizar los habitos como completados y cambiar la duracion del segundo habito
        habito1.marcarCompletado();
        habito2.setDuracion(90);

        System.out.println("Después de actualizar:");
        // mostrar la informacion actualizada de los habitos en consola
        habito1.mostrarHabito();
        habito2.mostrarHabito();
    }
}