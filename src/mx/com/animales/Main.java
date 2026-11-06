package mx.com.animales;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        crea al menos un perro, un gato y una vaca con nombres y edades
        diferentes

        almacenar en un arreglo Animal[]

        recorre el arreglo con un ciclo e invoca mostrar informacion()
        y hacerSonido()

        usa una referencia movible para invocar moverse en cada objeto

        no usar if para decidir que sonido hace cada animal
         */

        Animal[] grupoAnimales = {
                new Perro("Puppy", 8),
                new Gato("Wiskas", 9),
                new Vaca("Manchas", 3)

        };
        for (Animal animales : grupoAnimales){
            animales.mostrarInformacion();
            animales.hacerSonido();
            //Usa una referencia Movible para invocar moverse() en cada objeto.
            animales.moverse();
        }

    }
}