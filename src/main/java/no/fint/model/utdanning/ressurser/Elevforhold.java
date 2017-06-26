package no.fint.model.utdanning.ressurser;


import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.utdanning.basisklasser.Utdanningsforhold;

@Data
@EqualsAndHashCode(callSuper = false)
public class Elevforhold extends Utdanningsforhold {
    public enum Relasjonsnavn {
        KATEGORI,
        ELEVRESSURS
    }
}

