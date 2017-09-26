// Built from tag v2.0.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsforhold extends Utdanningsforhold {
    public enum Relasjonsnavn {
        ARBEIDSFORHOLD,
        TIME,
        MEDLEMSKAP
    }
}

