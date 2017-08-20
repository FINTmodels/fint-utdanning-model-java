package no.fint.model.utdanning.basisklasser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Undervisningsforhold extends Utdanningsforhold {
    public enum Relasjonsnavn {
        ARBEIDSFORHOLD,
        MEDLEMSKAP
    }
}

