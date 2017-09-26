// Built from tag v2.0.0

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Vurdering {
    private String kommentar;

    public enum Relasjonsnavn {
        KARAKTER
    }
}

