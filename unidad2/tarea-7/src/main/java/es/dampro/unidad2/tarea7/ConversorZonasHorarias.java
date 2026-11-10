package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Describe la finalidad de ConversorZonasHorarias.
 *
 * @author Mauro
 * @version 1.0.0
 */

public final class ConversorZonasHorarias {
    private ConversorZonasHorarias() { }

    /**
     * Cambia una hora a otra zona horaria.
     *
     * @param fechaOrigen fecha y hora con su zona
     * @param zonaDestino zona a la que se cambia
     * @return la misma hora en la zona nueva
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}