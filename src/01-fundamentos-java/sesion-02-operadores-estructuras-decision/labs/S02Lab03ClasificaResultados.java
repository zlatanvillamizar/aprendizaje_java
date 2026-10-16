public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 85;

        // TODO 1: Rechazar notas fuera de 0 a 100 antes de clasificarlas.
        // TODO 2: Clasificar con if/else if/else: A desde 90, B desde 80,
        // C desde 70, D desde 60 y E por debajo de 60.
        // TODO 3: Mostrar "Categoria X" o "Nota invalida" según corresponda.
        // TODO 4: Probar nota 85, 90 y 101; las demás entradas son opcionales.
        // TODO 5: Explicar con nota = 95 por qué el orden de las condiciones importa.
    }
}

public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 85;

        // TODO 1: Rechazar notas fuera de 0 a 100 antes de clasificarlas.
        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
        } else {
            // TODO 2: Clasificar con if/else if/else: A desde 90, B desde 80,
            // C desde 70, D desde 60 y E por debajo de 60.
            char categoria;

            if (nota >= 90) {
                categoria = 'A';
            } else if (nota >= 80) {
                categoria = 'B';
            } else if (nota >= 70) {
                categoria = 'C';
            } else if (nota >= 60) {
                categoria = 'D';
            } else {
                categoria = 'E';
            }

            // TODO 3: Mostrar "Categoria X" o "Nota invalida" según corresponda.
            System.out.println("Categoria " + categoria);
        }

        // TODO 4: Probar nota 85, 90 y 101; las demás entradas son opcionales.
        /*
         * Resultados de pruebas:
         * - nota = 85: Muestra "Categoria B" (cumple la condición >= 80).
         * - nota = 90: Muestra "Categoria A" (cumple la condición >= 90).
         * - nota = 101: Es rechazada al inicio, mostrando "Nota invalida".
         */

        // TODO 5: Explicar con nota = 95 por qué el orden de las condiciones importa.
        /*
         * Explicación (nota = 95): El orden importa porque la estructura 'if-else if'
         * evalúa las condiciones de arriba hacia abajo y se ejecuta únicamente en el
         * primer bloque que resulte verdadero. Si hubiéramos puesto primero 'nota >= 60',
         * el valor 95 habría entrado ahí y se habría clasificado incorrectamente.
         * Al ordenar de forma descendente (desde el límite más alto al más bajo),
         * nos aseguramos de que obtenga la categoría superior que le corresponde.
         */
    }
}