public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
    }
}

public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        /*
         * Regla de acceso: Una persona puede entrar si NO está bloqueada Y,
         * además, cumple al menos una de las siguientes condiciones:
         * ser mayor o igual de 18 años, ser miembro, o tener una invitación.
         */

        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        boolean puedeEntrar = !bloqueado && (edad >= 18 || esMiembro || tieneInvitacion);

        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        /*
         * Casos mínimos probados lógicamente:
         * 1. Caso base (con los valores actuales): Acceso permitido (cumple 18 y tiene invitación, sin bloqueo).
         * 2. Caso bloqueado (bloqueado = true): Acceso denegado (el operador && evalúa falso).
         * 3. Caso sin requisitos (edad 16, sin membresía, sin invitación): Acceso denegado.
         */

        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        /*
         * Explicación: El bloqueo impide siempre el acceso gracias al operador lógico AND (!bloqueado && ...).
         * Al ser 'bloqueado' verdadero, su negación (!bloqueado) se vuelve falsa. En una operación con &&,
         * si el primer operando es falso, toda la expresión se evalúa como falsa sin importar
         * lo que contengan las demás condiciones.
         */

        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
        /*
         * Registro de Debugging: Al colocar el breakpoint en la línea del 'if' y usar
         * el panel de variables de IntelliJ IDEA, se puede comprobar que la variable
         * 'puedeEntrar' adquiere el valor booleano 'true' o 'false' justo antes de decidir
         * qué bloque de código (if o else) se va a ejecutar.
         */
    }
}