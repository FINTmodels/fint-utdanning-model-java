// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.kompleksedatatyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Resultat {
    public enum Relasjonsnavn {
        KARAKTER
    }

    private String kommentar;
}

