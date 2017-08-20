package no.fint.model.utdanning;

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
    public enum Relasjonsnavn {
        MEDLEM,
        FORTLOPENDEKARATER,
        GRUPPE,
        ENDELIGKARAKTER,
        FRAVAR
    }

    private Identifikator systemId;
}

