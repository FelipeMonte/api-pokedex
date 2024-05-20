package br.com.felipemonte.pokedex.dto;

import br.com.felipemonte.pokedex.model.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonDTO {
    int pokemonNumber;
    String name;
    String spriteUrl;
    List<String> types = new ArrayList<>();

    public PokemonDTO(Pokemon pokemon) {
        this.pokemonNumber = pokemon.getNumber();
        this.name = pokemon.getName();
        this.spriteUrl = pokemon.getSpriteUrl();
        for (String type : pokemon.getTypes()) {
            this.types.add(type);
        }
    }

    public static List<PokemonDTO> pokemonsToDTOs(List<Pokemon> pokemons) {
        return pokemons.stream()
                .map(pokemon -> new PokemonDTO(pokemon))
                .collect(Collectors.toList());
    }

    public int getPokemonNumber() { return pokemonNumber; }

    public void setPokemonNumber(int number) {
        this.pokemonNumber = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpriteUrl() { return spriteUrl; }

    public void setSpriteUrl(String spriteUrl) { this.spriteUrl = spriteUrl; }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
