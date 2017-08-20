package no.fint.model.utdanning.ressurser;

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
public class Elevressurs {
    public enum Relasjonsnavn {
        FORESATT,
        PERSON,
        ELEVFORHOLD
    }

    private Kontaktinformasjon kontaktinformasjon;
    private Identifikator elevnummer;
    private Identifikator brukernavn;
    private Identifikator systemId;
}

