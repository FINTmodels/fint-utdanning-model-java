// Built from tag v2.0.0

package no.fint.model.utdanning.vurdering;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Eksamensgruppe extends Gruppe {
    public enum Relasjonsnavn {
        FAG,
        GREPREFERANSE,
        VIGOREFERANSE,
        MEDLEMSKAP
    }
}

