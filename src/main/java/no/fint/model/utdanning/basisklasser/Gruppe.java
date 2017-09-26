// Built from tag v2.0.0

package no.fint.model.utdanning.basisklasser;

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
public abstract class Gruppe {
    private String beskrivelse;
    private String navn;
    private Periode periode;
    private Identifikator systemId;
}

