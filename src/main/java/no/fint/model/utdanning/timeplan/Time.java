// Built from tag v0.99.9

package no.fint.model.utdanning.timeplan;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Time implements FintMainObject {
    public enum Relasjonsnavn {
            UNDERVISNINGSGRUPPE,
            UNDERVISNINGSFORHOLD,
            ROM
    }

    private String beskrivelse;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private Periode tidsrom;
}
