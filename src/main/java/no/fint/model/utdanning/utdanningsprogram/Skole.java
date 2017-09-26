// Built from tag v2.0.0

package no.fint.model.utdanning.utdanningsprogram;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Enhet;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode(callSuper = false)
public class Skole extends Enhet {
    private String domenenavn;
    private String juridiskNavn;
    private String navn;
    private Identifikator skolenummer;
    private Identifikator systemId;
    public enum Relasjonsnavn {
        ORGANISASJON,
        FAG,
        SKOLEEIERTYPE,
        VIGOREFERANSE,
        UTDANNINGSPROGRAM
    }
}

