package br.com.felipemonte.pokedex.model;

public class ExceptionModel {
    String message;

    public ExceptionModel() {
    }

    public ExceptionModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
