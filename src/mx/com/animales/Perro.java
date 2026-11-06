package mx.com.animales;

//implementar la interfaz
public class Perro extends Animal implements Movible{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        //hacer sonido diferente
        System.out.println("Guau");
    }

    @Override
    public void moverse() {
        System.out.println("moviendose en perro");
    }
}
