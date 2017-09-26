// Built from tag v2.0.0

package no.fint.model.utdanning.timeplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Time {
    private String beskrivelse;
    private String navn;
    private Identifikator systemId;
    private Periode tidsrom;
    public enum Relasjonsnavn {
        UNDERVISNINGSGRUPPE,
        UNDERVISNINGSFORHOLD,
        ROM
    }
}

