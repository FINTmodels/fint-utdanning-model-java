// Built from tag v2.6.0-beta-2

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Vurdering implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            KARAKTER
    }

    @NonNull
    private String kommentar;
}
