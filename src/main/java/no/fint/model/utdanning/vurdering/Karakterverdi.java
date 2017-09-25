// Built from tag v1.1.0-rc3

package no.fint.model.utdanning.vurdering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper=false)
public class Karakterverdi extends Begrep {
	public enum Relasjonsnavn {
			SKALA
	}
}

