// Built from tag v2.2.0

package no.fint.model.utdanning.timeplan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@EqualsAndHashCode
@ToString
public class Time implements FintMainObject {
	public enum Relasjonsnavn {
			UNDERVISNINGSGRUPPE,
			UNDERVISNINGSFORHOLD,
			ROM
	}

	private String beskrivelse;
	private String navn;
	private Identifikator systemId;
	private Periode tidsrom;
	}
