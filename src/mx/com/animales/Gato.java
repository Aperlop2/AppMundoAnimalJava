package mx.com.animales;

//implementar la interfaz
public class Gato extends Animal implements Movible {


    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        //hacer sonido diferente
        System.out.println("Miau");
    }

    @Override
    public void moverse() {
        System.out.println("moviendose en gato");
    }
}
