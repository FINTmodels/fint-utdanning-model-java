// Built from tag v2.0.0

package no.fint.model.utdanning.timeplan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsgruppe extends Gruppe {
    public enum Relasjonsnavn {
        FAG,
        TIME,
        GREPREFERANSE,
        VIGOREFERANSE,
        MEDLEMSKAP
    }
}

