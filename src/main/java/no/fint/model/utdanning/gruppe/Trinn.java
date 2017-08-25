// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.gruppe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Kodegruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Trinn extends Kodegruppe {
    public enum Relasjonsnavn {
        PROGRAMOMRADE,
        BASISGRUPPE,
        KODE,
        MEDLEMSKAP
    }
}

