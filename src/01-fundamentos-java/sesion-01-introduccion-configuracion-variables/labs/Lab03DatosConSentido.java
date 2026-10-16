public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        // inicial y activo. Usa String, int, double, char y boolean.
        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        // TODO 4: Probar el caso A del README; el caso B es opcional.
        // TODO 5: Explicar por qué String no es un tipo primitivo.
    }
}

public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura, inicial y activo.
        /*
         * Justificación de tipos:
         * - nombre: Se usa String porque almacena cadenas de texto (secuencias de caracteres).
         * - edad: Se usa int porque representa un número entero exacto.
         * - temperatura: Se usa double porque permite manejar números con decimales (mayor precisión).
         * - inicial: Se usa char porque almacena un único carácter delimitado por comillas simples.
         * - activo: Se usa boolean porque solo maneja dos estados posibles (verdadero o falso).
         */

        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        String nombre = "Carlos";
        int edad = 22;
        double temperatura = 36.5;
        char inicial = 'C';
        boolean activo = true;

        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Activo: " + activo);

        // TODO 4: Probar el caso A del README; el caso B es opcional.
        /*
         * El Caso A ha quedado cubierto con la declaración, asignación
         * e impresión de los datos básicos anteriores.
         */

        // TODO 5: Explicar por qué String no es un tipo primitivo.
        /*
         * Explicación: String no es un tipo primitivo porque en realidad es una clase
         * (un tipo de referencia). Esto significa que almacena objetos con métodos integrados
         * para manipular texto (como .length(), .toUpperCase(), etc.), a diferencia de los
         * tipos primitivos (como int, char, double, boolean), que solo almacenan un valor
         * crudo directamente en memoria sin métodos asociados.
         */
    }
}