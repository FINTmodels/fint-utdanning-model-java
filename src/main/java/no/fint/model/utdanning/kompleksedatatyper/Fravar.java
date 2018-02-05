// Built from tag v2.4.0-rc-4

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
