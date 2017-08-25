// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsforhold extends Utdanningsforhold {
    public enum Relasjonsnavn {
        ARBEIDSFORHOLD,
        TIME,
        MEDLEMSKAP
    }
}

