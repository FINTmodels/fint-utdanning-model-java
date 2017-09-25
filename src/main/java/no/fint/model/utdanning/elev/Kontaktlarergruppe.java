// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper=false)
public class Kontaktlarergruppe extends Gruppe {
	public enum Relasjonsnavn {
			BASISGRUPPE,
			GREPKODE,
			VIGOKODE,
			MEDLEMSKAP
	}
}

