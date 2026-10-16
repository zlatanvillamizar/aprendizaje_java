public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");

        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        // TODO 5: Explicar qué instrucción produce cada salto de línea.
    }
}

public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        /*
         * Predicción:
         * AB
         * C
         */
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");

        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        /*
         * Explicación: La salida coincide con la predicción. "A" y "B" quedan en la
         * misma línea ("AB") porque el primer print() no genera un salto de línea,
         * mientras que println("B") imprime la B y luego baja a la siguiente línea.
         */

        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        System.out.print("A - ");
        System.out.print("B - ");
        System.out.println("C");

        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        System.out.println("Fin del laboratorio");

        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        /*
         * Explicación: El salto de línea es producido exclusivamente por el método
         * println() (print line), el cual inserta un salto de línea al terminar de
         * imprimir su contenido. Las instrucciones con print() no generan saltos de línea.
         */
    }
}