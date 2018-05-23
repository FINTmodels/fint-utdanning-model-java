// Built from tag v2.8.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Undervisningsforhold extends Utdanningsforhold implements FintMainObject {
    public enum Relasjonsnavn {
            ARBEIDSFORHOLD,
            TIME,
            SKOLERESSURS,
            SKOLE,
            MEDLEMSKAP
    }

}
