// Built from tag v3.0.0-rc-1

package no.fint.model.utdanning.vurdering;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Vurdering implements FintMainObject {
    public enum Relasjonsnavn {
            KARAKTER
    }

    @NonNull
    private String kommentar;
    @NonNull
    private Identifikator systemId;
}
