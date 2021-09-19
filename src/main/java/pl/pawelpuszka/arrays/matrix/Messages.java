package pl.pawelpuszka.arrays.matrix;

enum Messages {
    ROWS_NUMBER_MSG("Podaj liczbę wierszy (3 - 10)"),
    COLUMNS_NUMBER_MSG("Podaj liczbę kolumn (3 - 10)"),
    GIVE_ME_INTEGER_MSG("Podaj liczbę całkowitą z zakresu 3 -10!"),
    UNKNOWN_ERROR_MSG("Wystąpił nieznany błąd. Aplikacja zakończy działanie."),
    ARRAY_IS_NULL_MSG("Macierz jest pusta!");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
