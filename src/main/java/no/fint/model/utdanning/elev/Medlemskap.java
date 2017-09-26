// Built from tag v2.0.0

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Medlemskap {
    private Identifikator systemId;

    public enum Relasjonsnavn {
        FRAVAR,
        FORTLOPENDEVURDERING,
        ENDELIGVURDERING,
        DELTAKER,
        GRUPPE
    }
}

