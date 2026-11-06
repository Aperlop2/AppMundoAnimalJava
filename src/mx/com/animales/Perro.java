package mx.com.animales;

public class Perro extends Animal{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        //hacer sonido diferente
        System.out.println("Guau");
    }
}
