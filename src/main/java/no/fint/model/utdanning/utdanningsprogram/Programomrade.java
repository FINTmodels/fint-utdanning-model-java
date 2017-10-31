// Built from tag v2.2.0

package no.fint.model.utdanning.utdanningsprogram;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Programomrade extends Gruppe implements FintMainObject {
	public enum Relasjonsnavn {
			UTDANNINGSPROGRAM,
			FAG,
			TRINN,
			GREPREFERANSE,
			VIGOREFERANSE,
			MEDLEMSKAP
	}
}
