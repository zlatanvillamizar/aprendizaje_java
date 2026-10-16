public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.

        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.

        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.

        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.

        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.

        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
    }
}

public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        String nombre = "Ana"; // Las cadenas de texto usan comillas dobles (""), no simples ('') que son para char.
        System.out.println("Nombre corregido: " + nombre);

        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
        double temperatura = 23.5; // Se cambia 'int' por 'double' para admitir números con decimales.
        System.out.println("Temperatura: " + temperatura);

        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
        int edad = 18; // En Java las variables locales deben inicializarse antes de usarse.
        System.out.println("Edad: " + edad);

        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.
        final String CURSO = "Java"; // La palabra reservada final impide que una constante sea modificada.
        System.out.println("Curso: " + CURSO);

        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
        /*
         * Registro para el README:
         * - Caso 1: Error de tipos (character literal/string literal mismatch). Causa: usar comillas simples para String. Corrección: usar comillas dobles.
         * - Caso 2: Error de pérdida de precisión (lossy conversion from double to int). Causa: asignar decimal a un entero. Corrección: usar double.
         * - Caso 3: Variable no inicializada (variable might not have been initialized). Causa: intentar leer una variable sin valor asignado. Corrección: asignarle un valor previo.
         * - Caso 4: Reasignación de variable final (cannot assign a value to final variable). Causa: intentar cambiar el valor de una constante. Corrección: no reasignarla y mostrar su valor inicial.
         */
    }
}