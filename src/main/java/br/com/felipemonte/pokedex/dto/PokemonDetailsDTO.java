package br.com.felipemonte.pokedex.dto;

import br.com.felipemonte.pokedex.model.BaseStats;
import br.com.felipemonte.pokedex.model.Move;
import br.com.felipemonte.pokedex.model.PokemonDetails;

import java.util.ArrayList;
import java.util.List;

public class PokemonDetailsDTO {

    int number;
    String name;
    String sprite;
    List<String> types = new ArrayList<>();
    double weight;
    double height;
    List<Move> moves = new ArrayList<>();
    String description;
    BaseStats stats;

    public PokemonDetailsDTO(int number, String name, String sprite, List<String> types, double weight, double height, List<Move> moves, String description, BaseStats baseStats) {
        this.number = number;
        this.name = name;
        this.sprite = sprite;
        for (String type : types) {
            this.types.add(type);
        }
        this.weight = weight;
        this.height = height;
        for (Move move : moves) {
            this.moves.add(move);
        }
        this.description = description;
        this.stats = baseStats;
    }

    public static PokemonDetailsDTO pokemonDetailsToDTO(PokemonDetails pokemonDetails) {
        return new PokemonDetailsDTO(
                pokemonDetails.getNumber(),
                pokemonDetails.getName(),
                pokemonDetails.getSprite(),
                pokemonDetails.getTypes(),
                pokemonDetails.getWeight(),
                pokemonDetails.getHeight(),
                pokemonDetails.getMoves(),
                pokemonDetails.getDescription(),
                pokemonDetails.getBaseStats()
        );
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSprite() {
        return sprite;
    }

    public List<String> getTypes() {
        return types;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public String getDescription() {
        return description;
    }

    public BaseStats getStats() {
        return stats;
    }
}
