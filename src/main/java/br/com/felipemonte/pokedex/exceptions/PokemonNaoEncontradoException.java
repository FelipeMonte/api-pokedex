package br.com.felipemonte.pokedex.exceptions;

public class PokemonNaoEncontradoException extends Exception {

    public PokemonNaoEncontradoException() {}

    public PokemonNaoEncontradoException(Exception e) {
        super(e);
    }

}