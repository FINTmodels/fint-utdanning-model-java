// Built from tag v2.2.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Kontaktlarergruppe extends Gruppe implements FintMainObject {
	public enum Relasjonsnavn {
			BASISGRUPPE,
			GREPREFERANSE,
			VIGOREFERANSE,
			MEDLEMSKAP
	}
}
