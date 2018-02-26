// Built from tag v0.99.0

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fravar implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            FRAVARSTYPE
    }

    @NonNull
    private Boolean dokumentert;
    @NonNull
    private Boolean foresPaVitnemal;
    @NonNull
    private Periode gjelderPeriode;
    @NonNull
    private String kommentar;
}
