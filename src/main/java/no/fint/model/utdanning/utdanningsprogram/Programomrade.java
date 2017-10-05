// Built from tag v2.0.10

package no.fint.model.utdanning.utdanningsprogram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Programomrade extends Gruppe {
	public enum Relasjonsnavn {
			UTDANNINGSPROGRAM,
			FAG,
			TRINN,
			GREPREFERANSE,
			VIGOREFERANSE,
			MEDLEMSKAP
	}
}

