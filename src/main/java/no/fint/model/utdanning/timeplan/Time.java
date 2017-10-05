// Built from tag v2.0.10

package no.fint.model.utdanning.timeplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Time {
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

