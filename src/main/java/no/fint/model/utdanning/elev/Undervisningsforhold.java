// Built from tag v2.0.10

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Undervisningsforhold extends Utdanningsforhold {
	public enum Relasjonsnavn {
			ARBEIDSFORHOLD,
			TIME,
			MEDLEMSKAP
	}
}

