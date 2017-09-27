// Built from tag v2.0.0

package no.fint.model.utdanning.elev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@EqualsAndHashCode(callSuper=false)
public class Elevforhold extends Utdanningsforhold {
	public enum Relasjonsnavn {
			ELEV,
			KATEGORI,
			MEDLEMSKAP
	}
}

