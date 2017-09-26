// Built from tag v2.0.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kontaktlarergruppe extends Gruppe {
    public enum Relasjonsnavn {
        BASISGRUPPE,
        GREPREFERANSE,
        VIGOREFERANSE,
        MEDLEMSKAP
    }
}

