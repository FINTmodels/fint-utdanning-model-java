// Built from tag v2.0.0

package no.fint.model.utdanning.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper=false)
public class Karakterskala extends Begrep {
	public enum Relasjonsnavn {
			VIGOREFERANSE,
			VERDI
	}
}

