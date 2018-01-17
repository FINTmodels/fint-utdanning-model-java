// Built from tag v2.4.0-rc-2

package no.fint.model.utdanning.vurdering;

import java.util.Arrays;
import java.util.List;

public enum VurderingActions {
	
	GET_EKSAMENSGRUPPE,
	GET_ALL_EKSAMENSGRUPPE,
	UPDATE_EKSAMENSGRUPPE,
	GET_KARAKTERVERDI,
	GET_ALL_KARAKTERVERDI,
	UPDATE_KARAKTERVERDI
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(VurderingActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

