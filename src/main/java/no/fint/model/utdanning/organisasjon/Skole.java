// Built from tag v1.1.0-rc2

package no.fint.model.utdanning.organisasjon;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Enhet;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode(callSuper = false)
public class Skole extends Enhet {
    public enum Relasjonsnavn {
        ORGANISASJON,
        SKOLEEIERTYPE,
        UTDANNINGSPROGRAM
    }

    private String domenenavn;
    private String juridiskNavn;
    private String navn;
    private Identifikator skolenummer;
    private Identifikator systemId;
}

