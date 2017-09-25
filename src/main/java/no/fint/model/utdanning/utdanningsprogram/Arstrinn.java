// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.utdanningsprogram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper=false)
public class Arstrinn extends Gruppe {
	public enum Relasjonsnavn {
			PROGRAMOMRADE,
			BASISGRUPPE,
			GREPKODE,
			VIGOKODE,
			MEDLEMSKAP
	}
}

