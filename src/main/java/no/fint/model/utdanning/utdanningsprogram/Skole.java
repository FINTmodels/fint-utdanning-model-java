// Built from tag v2.6.0-beta-1

package no.fint.model.utdanning.utdanningsprogram;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Skole extends Enhet implements FintMainObject {
    public enum Relasjonsnavn {
            ORGANISASJON,
            FAG,
            SKOLEEIERTYPE,
            VIGOREFERANSE,
            UTDANNINGSPROGRAM,
            UTDANNINGSFORHOLD
    }

    private String domenenavn;
    private String juridiskNavn;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator skolenummer;
    @NonNull
    private Identifikator systemId;
}
