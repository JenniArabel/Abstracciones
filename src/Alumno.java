public class Alumno extends Persona{
    private int legajo;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, int legajo) {
        this.legajo = legajo;
        this.nombre
    }

    public int getLegajo() {
        return legajo;
    }


    //Se sobreescribe
    public void andar(){
        System.out.println("Yo ando corriendo");
    }
}
