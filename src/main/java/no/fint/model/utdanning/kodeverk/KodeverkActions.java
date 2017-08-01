package no.fint.model.utdanning.kodeverk;

import java.util.Arrays;
import java.util.List;

public enum KodeverkActions {

    GET_ELEVKATEGORI,
    GET_ALL_ELEVKATEGORI,
    UPDATE_ELEVKATEGORI,
    GET_KARAKTERSKALA,
    GET_ALL_KARAKTERSKALA,
    UPDATE_KARAKTERSKALA,
    GET_KARAKTERVERDI,
    GET_ALL_KARAKTERVERDI,
    UPDATE_KARAKTERVERDI,
    GET_SKOLEEIERTYPE,
    GET_ALL_SKOLEEIERTYPE,
    UPDATE_SKOLEEIERTYPE;

    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(KodeverkActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

