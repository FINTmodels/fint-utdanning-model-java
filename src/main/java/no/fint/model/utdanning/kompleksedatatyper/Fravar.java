// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Fravar {
    private boolean erFravaretGyldig;
    private Periode gjelderPeriode;
    private String kommentar;
}

