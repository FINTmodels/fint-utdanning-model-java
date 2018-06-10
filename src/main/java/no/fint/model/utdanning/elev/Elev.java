// Built from tag v3.0.0

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
    private Identifikator elevnummer;
    private Identifikator feidenavn;
    private Kontaktinformasjon kontaktinformasjon;
    @NonNull
    private Identifikator systemId;
}
