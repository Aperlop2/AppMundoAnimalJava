# MundoAnimal (AppMundoAnimalJava)

Aplicación de ejemplo en **Java** que muestra información de distintos animales: su nombre, edad, el sonido que hacen y su forma de desplazarse. El proyecto demuestra los pilares de **herencia**, **clases abstractas**, **interfaces** y **polimorfismo**: cada animal invoca sus propios métodos y "personalidad" sin necesidad de condicionales (`if`) para decidir qué hace cada uno.

## Descripción

- `Animal` es una **clase abstracta** (molde general) que define los atributos `nombre` y `edad`, el método concreto `mostrarInformacion()` y el método abstracto `hacerSonido()`.
- `Movible` es una **interfaz** que declara el método `moverse()`, ya que todo animal puede desplazarse.
- `Perro`, `Gato` y `Vaca` son **subclases concretas** que extienden `Animal`, implementan `Movible` y **sobrescriben** `hacerSonido()` y `moverse()` con su propio comportamiento.
- `Main` crea un arreglo polimórfico `Animal[]`, lo recorre con un ciclo `for-each` e invoca `mostrarInformacion()`, `hacerSonido()` y `moverse()` en cada objeto. La JVM decide en tiempo de ejecución qué versión del método ejecutar (**enlace dinámico / polimorfismo**).

## 📁 Estructura del proyecto

```
MundoAnimal/
├── README.md
├── MundoAnimal.iml              # Módulo de IntelliJ IDEA
├── .gitignore
└── src/                         # Raíz de código fuente (source folder)
    └── mx/
        └── com/
            └── animales/        # Paquete: mx.com.animales
                ├── Animal.java      # Clase abstracta base (implements Movible)
                ├── Movible.java     # Interfaz con el método moverse()
                ├── Perro.java       # Subclase concreta: "Guau"
                ├── Gato.java        # Subclase concreta: "Miau"
                ├── Vaca.java        # Subclase concreta: "Muuuuuuuuuuu"
                └── Main.java        # Punto de entrada (método main)
```

## ▶️ Instrucciones para ejecutar

### Requisitos

- **JDK 8 o superior** instalado (`javac` y `java` disponibles en la ruta). Verificar con:

```bash
java -version
javac -version
```

### Opción 1: IntelliJ IDEA (recomendada, el proyecto ya incluye `MundoAnimal.iml`)

1. Abrir IntelliJ IDEA → **File > Open** y seleccionar la carpeta raíz del repositorio.
2. Asegurarse de que la carpeta `src` esté marcada como *Sources Root* (el módulo ya lo indica).
3. Abrir `src/mx/com/animales/Main.java` y pulsar el botón **Run** (▶) junto al método `main`, o usar el atajo `Shift + F10`.

### Opción 2: Línea de comandos (compilación manual)

Desde la raíz del proyecto:

```bash
# 1. Compilar todas las clases hacia la carpeta bin
mkdir bin
javac -d bin src/mx/com/animales/*.java

# 2. Ejecutar la clase principal indicando el classpath
java -cp bin mx.com.animales.Main
```

## 🖨️ Ejemplo de salida

Al ejecutar `Main`, se recorren los tres animales del arreglo polimórfico y la consola muestra:

```
Nombre del animal: Puppy Tiene: 8 anios
Guau
moviendose en perro
Nombre del animal: Wiskas Tiene: 9 anios
Miau
moviendose en gato
Nombre del animal: Manchas Tiene: 3 anios
Muuuuuuuuuuu
moviendose en vaca
```

## 💡 Conceptos demostrados

| Concepto | Dónde se aplica |
|----------|-----------------|
| Clase abstracta | `Animal` (no se pueden crear instancias directas de ella) |
| Herencia | `Perro`, `Gato` y `Vaca` extienden `Animal` usando `extends` |
| Interfaz | `Movible` se implementa con `implements` |
| Sobrescritura de métodos | `hacerSonido()` y `moverse()` marcados con `@Override` |
| Polimorfismo | Referencias `Animal[]` invocan el método propio de cada subclase sin usar `if` |

## 👤 Autor

Proyecto de aprendizaje de POO en Java (Mundo Animal).
