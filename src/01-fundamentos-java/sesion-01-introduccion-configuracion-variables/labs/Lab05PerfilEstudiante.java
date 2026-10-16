public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.
        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        // TODO 3: Declarar final String CURSO con el valor "Java".
        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.
        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.
    }
}


public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.
        /*
         * Tipos identificados:
         * - nombre: String (para almacenar cadenas de texto)
         * - edad: int (para números enteros)
         * - ciudad: String (para texto de ubicación)
         * - promedio: double (para números decimales)
         * - activo: boolean (para valores lógicos verdadero/falso)
         */

        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        String nombre = "Zlatan";
        int edad = 17;
        String ciudad = "Cúcuta";
        double promedio = 4.8;
        boolean activo = true;

        // TODO 3: Declarar final String CURSO con el valor "Java".
        final String CURSO = "Java";

        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        System.out.println("=== FICHA INICIAL DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);
        System.out.println("Curso: " + CURSO);
        System.out.println("------------------------------------");

        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        ciudad = "Bogotá";
        System.out.println("Ciudad actualizada: " + ciudad);

        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        /*
         * El Perfil A se ha completado satisfactoriamente con los datos
         * declarados e impresos anteriormente.
         */

        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.
        /*
         * Registro de Debugging para el README:
         * - Valor anterior de ciudad (antes del Step Over): "Cúcuta"
         * - Valor nuevo de ciudad (después del Step Over): "Bogotá"
         */

        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.
        /*
         * Explicación:
         * - Elección de tipo: Se eligió 'double' para el promedio porque permite
         *   manejar con precisión valores numéricos con decimales (calificaciones).
         * - Garantía de final: La palabra reservada 'final' aplicada a CURSO
         *   garantiza que su valor sea constante y no pueda ser modificado o reasignado
         *   en ninguna otra parte del programa una vez inicializado.
         */
    }
}