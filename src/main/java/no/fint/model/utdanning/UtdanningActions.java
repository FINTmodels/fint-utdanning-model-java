package no.fint.model.utdanning;

import java.util.Arrays;
import java.util.List;

public enum UtdanningActions {

    GET_MEDLEMSKAP,
    GET_ALL_MEDLEMSKAP,
    UPDATE_MEDLEMSKAP;

    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(UtdanningActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

