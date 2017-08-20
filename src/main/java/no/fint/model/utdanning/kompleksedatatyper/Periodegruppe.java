package no.fint.model.utdanning.kompleksedatatyper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Periodegruppe extends Periode {
    private String beskrivelse;
}

