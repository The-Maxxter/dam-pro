package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Calcula la llegada de un viaje.
 *
 * @author Mauro
 * @version 1.0.0
 */

public final class CalculadoraViaje {
    private CalculadoraViaje() { }

    /**
     * Calcula cuando llega el viaje.
     *
     * @param salida fecha y hora de salida
     * @param horas horas que dura el viaje
     * @param minutos minutos que dura el viaje
     * @return fecha y hora de llegada
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("Las horas y los minutos no pueden ser negativos");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}