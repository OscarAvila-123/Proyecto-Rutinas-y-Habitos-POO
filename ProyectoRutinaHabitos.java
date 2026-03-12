public class ProyectoRutinaHabitos {

    public static void main(String[] args) {

        Habitos habito1 = new Habitos("Hacer ejercicio", "Salud", 30);
        Habitos habito2 = new Habitos("Estudiar Java", "Estudio", 60);

        habito1.mostrarHabito();
        habito2.mostrarHabito();

        habito1.marcarCompletado();
        habito2.setDuracion(90);

        System.out.println("Después de actualizar:");

        habito1.mostrarHabito();
        habito2.mostrarHabito();
    }
}