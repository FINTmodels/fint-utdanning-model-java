package no.fint.model.utdanning.ressurser;

import java.util.Arrays;
import java.util.List;

public enum RessurserActions {

    GET_ELEVFORHOLD,
    GET_ALL_ELEVFORHOLD,
    UPDATE_ELEVFORHOLD,
    GET_ELEVRESSURS,
    GET_ALL_ELEVRESSURS,
    UPDATE_ELEVRESSURS;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(RessurserActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

