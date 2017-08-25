// Built from tag v1.1.0-rc2

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
    public enum Relasjonsnavn {
        UNDERVISNINGSGRUPPE,
        UNDERVISNINGSFORHOLD,
        ROM
    }

    private String beskrivelse;
    private Identifikator systemId;
    private String tittel;
    private Periode varighet;
}

