// Built from tag v2.2.0

package no.fint.model.utdanning.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Karakterskala extends Begrep implements FintMainObject {
	public enum Relasjonsnavn {
			VIGOREFERANSE,
			VERDI
	}
}
