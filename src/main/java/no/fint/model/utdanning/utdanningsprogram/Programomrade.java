// Built from tag v2.0.0

package no.fint.model.utdanning.utdanningsprogram;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Programomrade extends Gruppe {
    public enum Relasjonsnavn {
        UTDANNINGSPROGRAM,
        FAG,
        TRINN,
        GREPREFERANSE,
        VIGOREFERANSE,
        MEDLEMSKAP
    }
}

