// Built from tag v2.0.0

package no.fint.model.utdanning.vurdering;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper = false)
public class Karakterverdi extends Begrep {
    public enum Relasjonsnavn {
        SKALA
    }
}

