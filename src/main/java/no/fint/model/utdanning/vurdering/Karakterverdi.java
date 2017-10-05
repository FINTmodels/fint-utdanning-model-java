// Built from tag v2.0.10

package no.fint.model.utdanning.vurdering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Karakterverdi extends Begrep {
	public enum Relasjonsnavn {
			SKALA
	}
}

