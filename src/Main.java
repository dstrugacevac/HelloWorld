public class Main {
    public static void main(String[] args) {
        Student student = new Student("Petar", "Peric", "321", 4.5);
        student.setProsjekOcjena(1.0);
        student.ispisiVrijednostiOsobe();
        student.definirajMe();

        Profesor profesor = new Profesor("Marko", "Maric", 4);
        profesor.ispisiVrijednostiOsobe();
        profesor.definirajMe();

       
    }
}
