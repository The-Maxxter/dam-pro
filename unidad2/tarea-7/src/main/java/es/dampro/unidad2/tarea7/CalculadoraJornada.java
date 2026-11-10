package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Calcula el tiempo trabajado en una jornada.
 *
 * @author Mauro
 * @version 1.0.0
 */

public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Calcula las horas trabajadas.
     *
     * @param entrada hora a la que entra
     * @param salida hora a la que sale
     * @param descansoMinutos minutos de descanso
     * @return el tiempo trabajado sin el descanso
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException("La salida debe ser posterior a la entrada");
        }
        if (descansoMinutos < 0) {
            throw new IllegalArgumentException("El descanso no puede ser negativo");
        }
        Duration trabajado = Duration.between(entrada, salida).minusMinutes(descansoMinutos);
        if (trabajado.isNegative()) {
            throw new IllegalArgumentException("El descanso es mayor que la jornada");
        }
        return trabajado;
    }
}