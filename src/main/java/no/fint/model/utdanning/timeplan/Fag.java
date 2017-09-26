// Built from tag v2.0.0

package no.fint.model.utdanning.timeplan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Fag extends Gruppe {
    public enum Relasjonsnavn {
        PROGRAMOMRADE,
        UNDERVISNINGSGRUPPE,
        EKSAMENSGRUPPE,
        GREPREFERANSE,
        VIGOREFERANSE,
        MEDLEMSKAP
    }
}

