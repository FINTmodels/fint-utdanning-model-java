package no.fint.model.utdanning.kompleksedatatyper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Resultat {
    private String kommentar;

    public enum Relasjonsnavn {
        KARAKTER
    }
}

