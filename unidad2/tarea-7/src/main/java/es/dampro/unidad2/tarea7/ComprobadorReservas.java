package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Comprueba si dos reservas se pisan.
 *
 * @author Mauro
 * @version 1.0.0
 */

public final class ComprobadorReservas {
    private ComprobadorReservas() { }

    /**
     * Dice si dos reservas se pisan.
     *
     * @param inicio1 cuando empieza la reserva 1
     * @param fin1 cuando acaba la reserva 1
     * @param inicio2 cuando empieza la reserva 2
     * @param fin2 cuando acaba la reserva 2
     * @return true si se pisan, false si no
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1, LocalDateTime inicio2, LocalDateTime fin2) {
        if (!inicio1.isBefore(fin1) || !inicio2.isBefore(fin2)) {
            throw new IllegalArgumentException("El inicio debe ser anterior al fin");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}