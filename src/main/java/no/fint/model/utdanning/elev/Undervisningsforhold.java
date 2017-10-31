// Built from tag v2.2.0

package no.fint.model.utdanning.elev;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Undervisningsforhold extends Utdanningsforhold implements FintMainObject {
	public enum Relasjonsnavn {
			ARBEIDSFORHOLD,
			TIME,
			MEDLEMSKAP
	}
}
