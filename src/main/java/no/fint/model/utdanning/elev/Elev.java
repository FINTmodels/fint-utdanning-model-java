// Built from tag v0.99.9

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Elev implements FintMainObject {
    public enum Relasjonsnavn {
            PERSON,
            ELEVFORHOLD
    }

    private Identifikator brukernavn;
    @NonNull
    private Identifikator elevnummer;
    private Kontaktinformasjon kontaktinformasjon;
    private Identifikator systemId;
}
