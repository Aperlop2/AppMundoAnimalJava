package mx.com.animales;

//herencia y sobreescritura
public class Vaca extends Animal{
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
}
