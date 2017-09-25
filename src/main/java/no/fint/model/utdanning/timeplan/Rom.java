// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.timeplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Rom {
	public enum Relasjonsnavn {
			TIME
	}

	private String navn;
	private Identifikator systemId;
	}

