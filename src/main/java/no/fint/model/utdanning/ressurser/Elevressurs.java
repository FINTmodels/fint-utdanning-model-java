package no.fint.model.utdanning.ressurser;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.relation.Identifiable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Elevressurs implements Identifiable {
    private Kontaktinformasjon kontaktinformasjon;
    private Identifikator elevnummer;
    private Identifikator brukernavn;
    private Identifikator systemId;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getElevnummer().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        FORESATT,
        PERSON,
        ELEVFORHOLD
    }
}

