// Built from tag v2.0.0

package no.fint.model.utdanning.utdanningsprogram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper=false)
public class Arstrinn extends Gruppe {
	public enum Relasjonsnavn {
			PROGRAMOMRADE,
			BASISGRUPPE,
			GREPREFERANSE,
			VIGOREFERANSE,
			MEDLEMSKAP
	}
}

