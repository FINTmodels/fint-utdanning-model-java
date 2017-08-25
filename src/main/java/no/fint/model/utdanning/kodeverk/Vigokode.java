// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppekode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Vigokode extends Gruppekode {
    public enum Relasjonsnavn {
        GREPKODE
    }
}

