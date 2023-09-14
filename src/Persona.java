public abstract class Persona {
    protected String nombre;
    protected int edad;


    //metodos:

    public abstract void andar();
    //Cuando un metodo es abstracto se le coloca abstract, es void entonces no devuelve nada y el nombre del metodo
    //Es vacio porque es abstracto, es decir sin llave
    //En un metodo normal va con llaves y puede tener condicionales, o cualquier código.
    //Otra diferencia entre una clase abstracta y comun, es que en las abstracctas no se puede instanciar
    //Ej. una vez creado los constructores (por defecto y sobrecargado), en la clase main no se puede instanciar o mandar a llamar a la clase abstracta, se pone en rojo mostrando error

    public void escribir(){
        System.out.println("Estoy escribiendo");
    }
}
