public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        // TODO 2: Manejar default como opción inválida; no mostrar un costo válido.
        // TODO 3: En opciones válidas mostrar "Costo (centavos): " con el valor.
        // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
        // TODO 5: Mostrar la etiqueta con "Etiqueta: "; para invalidos mostrar solo
        // "Tipo de entrega invalido".
        // TODO 6: Probar los tres tipos y DRON; opcionalmente comparar switch clásico y moderno
        // en tu copia personal. Entregar una versión y explicar break y las flechas.
    }
}

public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1 & 2 & 3: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        // Manejar default como opción inválida; en válidas mostrar "Costo (centavos): ".
        int costo = 0;
        boolean esValido = true;

        switch (tipoEntrega) {
            case "ESTANDAR" -> costo = 500;
            case "EXPRESS" -> costo = 1200;
            case "RECOGIDA" -> costo = 0;
            default -> esValido = false;
        }

        // TODO 5: Mostrar la etiqueta con "Etiqueta: "; para inválidos mostrar solo "Tipo de entrega invalido".
        if (!esValido) {
            System.out.println("Tipo de entrega invalido");
        } else {
            System.out.println("Costo (centavos): " + costo);

            // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
            String descripcionEntrega = tipoEntrega.equals("RECOGIDA") ? "Retiro en tienda" : "Entrega a domicilio";
            System.out.println("Etiqueta: " + descripcionEntrega);
        }

        // TODO 6: Probar los tipos y DRON; explicar break y las flechas (->).
        /*
         * Explicación de switch clásico vs moderno (flechas -> y break):
         * - Switch Clásico: Utiliza los dos puntos (:) y requiere la instrucción 'break'
         *   al final de cada case para evitar el error de "fall-through" (que la ejecución
         *   continúe ejecutando los siguientes casos por accidente).
         * - Switch Moderno (con flechas ->): Introduce expresiones de flecha que evitan
         *   automáticamente el "fall-through", por lo que no es necesario escribir 'break'
         *   en cada caso, haciendo el código mucho más limpio y menos propenso a errores.
         *
         * Pruebas realizadas:
         * - "EXPRESS": Muestra costo 1200 y "Etiqueta: Entrega a domicilio".
         * - "ESTANDAR": Muestra costo 500 y "Etiqueta: Entrega a domicilio".
         * - "RECOGIDA": Muestra costo 0 y "Etiqueta: Retiro en tienda".
         * - "DRON": Al no estar contemplado, cae en el 'default' y muestra solo "Tipo de entrega invalido".
         */
    }
}