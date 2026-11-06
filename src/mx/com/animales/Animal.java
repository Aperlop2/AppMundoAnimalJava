package mx.com.animales;

//clase abstracta clase base
public abstract class Animal {
    //agregar atributos
    private String nombre;
    private int edad;

    //constructor para recibir nombre y edad
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //crear el metodo de mostrar informacion para retornarlo
    public String mostrarInformacion(){
        return "Nombre del animal: " + this.nombre + "Tiene: " + this.edad + "anios";
    }

    //todo animal hace sonido
    public abstract void hacerSonido();

    /*
    directamente en la clase no se puede crear un objeto ya que la clase
    reprecenta un concepto gneral o un molde
     */

}
