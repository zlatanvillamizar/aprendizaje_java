public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
    }
}

public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        /*
         * Predicciones:
         * - Suma (7 + 2): 9
         * - Resto (7 - 2): 5
         * - Producto (7 * 2): 14
         * - División entera (7 / 2): 3
         * - Resto (7 % 2): 1
         * - 7.0 / 2: 3.5
         * - 2 + 3 * 4: 14 (por precedencia: la multiplicación se hace primero)
         * - (2 + 3) * 4: 20 (los paréntesis alteran la precedencia)
         * - Contador incrementado: 4
         * - Contador decrementado: 3
         */

        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        System.out.println("=== OPERACIONES BÁSICAS ===");
        System.out.println("Suma: " + (unidades + capacidad));
        System.out.println("Resta: " + (unidades - capacidad));
        System.out.println("Producto: " + (unidades * capacidad));
        System.out.println("División entera: " + (unidades / capacidad));
        System.out.println("Resto: " + (unidades % capacidad));

        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        System.out.println("7.0 / capacidad: " + (7.0 / capacidad));
        /*
         * Explicación: Conserva decimales porque el número 7.0 es un literal de tipo double.
         * Java realiza una promoción de tipos implícita, convirtiendo el valor de 'capacidad'
         * a double para realizar una división de punto flotante en lugar de una división entera.
         */

        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        System.out.println("=== PRECEDENCIA DE OPERADORES ===");
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));

        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        System.out.println("=== INCREMENTO Y DECREMENTO ===");
        contador++;
        System.out.println("Contador incrementado: " + contador);
        contador--;
        System.out.println("Contador decrementado: " + contador);

        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        /*
         * Si probáramos con unidades = 8:
         * - La división entera (8 / 2) daría exactamente 4.
         * - El resto (8 % 2) daría 0, ya que 8 es divisible de forma exacta entre 2.
         */

        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        /*
         * Registro final: Las predicciones coincidieron al 100% con los resultados de la consola.
         * No hubo diferencias, lo que valida el correcto entendimiento de la jerarquía de
         * operadores aritméticos y el comportamiento de los tipos de datos numéricos en Java.
         */
    }
}