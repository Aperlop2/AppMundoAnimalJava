package mx.com.animales;

public class Gato extends Animal {


    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        //hacer sonido diferente
        System.out.println("Miau");
    }
}
