// Built from tag v2.0.0

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Elev {
    private Identifikator brukernavn;
    private Identifikator elevnummer;
    private Kontaktinformasjon kontaktinformasjon;
    private Identifikator systemId;
    public enum Relasjonsnavn {
        PERSON,
        ELEVFORHOLD
    }
}

