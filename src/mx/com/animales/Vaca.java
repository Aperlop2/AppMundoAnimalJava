package mx.com.animales;

//herencia y sobreescritura
public class Vaca extends Animal implements Movible{
    //constructor con super de la clase padre
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    //sobreescribir metodo de la clase padre
    @Override
    public void hacerSonido() {
        //hacer sonido diferente
        System.out.println("Muuuuuuuuuuu");
    }

    @Override
    public void moverse() {
        System.out.println("moviendose en vaca");
    }

    /*
    extends se declara cuando se invoca la clase padre mientras
    que implements se declara al invocar la interfaz
     */
}
