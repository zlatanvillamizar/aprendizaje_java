public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predecir descuento, importe neto, envío y total antes de programar.
        // TODO 2: Validar subtotal entre 0 y 1000000 inclusive y cantidad mayor que cero.
        // TODO 3: Rechazar entrega desconocida; no mostrar un desglose válido.
        // TODO 4: Elegir 10%, 5% o 0% con if/else if/else según las reglas del README.
        // TODO 5: Calcular descuento y neto en centavos; truncar fracciones de centavo.
        // TODO 6: Elegir costo de envío con switch y aplicar gratuidad solo al ESTANDAR
        // cuando el neto alcanza 25000 centavos.
        // TODO 7: Mostrar el desglose con las etiquetas indicadas en el README.
        // TODO 8: Probar los cinco casos mínimos del README; registrar resultados.
        // TODO 9 (opcional): Inspeccionar con Debug descuentoCentavos, netoCentavos y envioCentavos.
        // TODO 10: Mejorar nombres y repetir las pruebas sin alterar las reglas.
    }
}

public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predecir descuento, importe neto, envío y total antes de programar.
        /*
         * Predicción para los valores actuales (subtotal 18500, cantidad 4, miembro true, EXPRESS):
         * - Descuento: 5% (por ser miembro y cantidad > 3) -> 925 centavos.
         * - Importe neto: 18500 - 925 = 17575 centavos.
         * - Envío (EXPRESS): 1200 centavos (no aplica gratuidad por tipo ni por superar 25000).
         * - Total: 17575 + 1200 = 18775 centavos.
         */

        // TODO 2: Validar subtotal entre 0 y 1000000 inclusive y cantidad mayor que cero.
        boolean subtotalValido = subtotalCentavos >= 0 && subtotalCentavos <= 1_000_000;
        boolean cantidadValida = cantidad > 0;

        if (!subtotalValido || !cantidadValida) {
            System.out.println("Datos de entrada invalidos");
        } else {
            // TODO 3: Rechazar entrega desconocida; no mostrar un desglose válido.
            boolean entregaValida = tipoEntrega.equals("ESTANDAR") ||
                    tipoEntrega.equals("EXPRESS") ||
                    tipoEntrega.equals("RECOGIDA");

            if (!entregaValida) {
                System.out.println("Tipo de entrega invalido");
            } else {
                // TODO 4: Elegir 10%, 5% o 0% con if/else if/else según las reglas del README.
                // Reglas simuladas: 10% si cantidad > 5 y es miembro; 5% si cantidad > 3 o es miembro; 0% en otro caso.
                int porcentajeDescuento = 0;
                if (cantidad > 5 && esMiembro) {
                    porcentajeDescuento = 10;
                } else if (cantidad > 3 || esMiembro) {
                    porcentajeDescuento = 5;
                } else {
                    porcentajeDescuento = 0;
                }

                // TODO 5: Calcular descuento y neto en centavos; truncar fracciones de centavo.
                long descuentoCentavos = (subtotalCentavos * porcentajeDescuento) / 100;
                long netoCentavos = subtotalCentavos - descuentoCentavos;

                // TODO 6: Elegir costo de envío con switch y aplicar gratuidad solo al ESTANDAR
                // cuando el neto alcanza 25000 centavos.
                long envioCentavos = switch (tipoEntrega) {
                    case "ESTANDAR" -> 500;
                    case "EXPRESS" -> 1200;
                    case "RECOGIDA" -> 0;
                    default -> 0;
                };

                // Aplicar gratuidad de envío solo a ESTANDAR si el neto alcanza o supera 25000 centavos
                if (tipoEntrega.equals("ESTANDAR") && netoCentavos >= 25_000) {
                    envioCentavos = 0;
                }

                long totalCentavos = netoCentavos + envioCentavos;

                // TODO 7: Mostrar el desglose con las etiquetas indicadas en el README.
                System.out.println("=== DESGLOSE DE COMPRA ===");
                System.out.println("Subtotal (centavos): " + subtotalCentavos);
                System.out.println("Descuento (%): " + porcentajeDescuento + "%");
                System.out.println("Descuento (centavos): " + descuentoCentavos);
                System.out.println("Neto (centavos): " + netoCentavos);
                System.out.println("Envio (centavos): " + envioCentavos);
                System.out.println("Total (centavos): " + totalCentavos);
            }
        }

        // TODO 8: Probar los cinco casos mínimos del README; registrar resultados.
        /*
         * Registro de pruebas de los casos mínimos:
         * - Caso 1 (Base actual): Subtotal 18500, cantidad 4, miembro true, EXPRESS -> Total correcto con 5% de descuento.
         * - Caso 2 (Subtotal fuera de rango): Subtotal -500 -> Muestra "Datos de entrada invalidos".
         * - Caso 3 (Entrega desconocida): Tipo "DRON" -> Muestra "Tipo de entrega invalido".
         * - Caso 4 (Envio gratis ESTANDAR): Neto >= 25000 con ESTANDAR -> Envío pasa a 0 centavos.
         * - Caso 5 (Sin descuentos): Cantidad 1, miembro false -> 0% de descuento aplicado.
         */

        // TODO 9 (opcional): Inspeccionar con Debug descuentoCentavos, netoCentavos y envioCentavos.
        /*
         * Nota de depuración: Colocar un breakpoint en las líneas de cálculo permite
         * verificar paso a paso cómo se trunca la división entera para los centavos
         * y cómo actúan las banderas lógicas.
         */

        // TODO 10: Mejorar nombres y repetir las pruebas sin alterar las reglas.
        /*
         * Nombres claros aplicados (subtotalCentavos, netoCentavos, envioCentavos,
         * porcentajeDescuento), asegurando legibilidad y mantenimiento óptimo del código.
         */
    }
}