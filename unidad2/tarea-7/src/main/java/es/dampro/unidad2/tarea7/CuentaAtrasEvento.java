package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * TODO: Describe la finalidad de CuentaAtrasEvento.
 *
 * @author Mauro
 * @version 1.0.0
 */
public final class CuentaAtrasEvento {
    private CuentaAtrasEvento() { }

    /**
     * Cuenta los dias naturales que faltan hasta el evento, con signo:
     * positivo si falta, cero si es hoy, negativo si ya paso.
     *
     * @param hoy fecha de hoy
     * @param evento fecha del evento
     * @return dias con signo: positivo si falta, cero si es hoy, negativo si ya paso
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}