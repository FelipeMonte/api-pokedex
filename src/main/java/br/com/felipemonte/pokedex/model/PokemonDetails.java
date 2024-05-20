package br.com.felipemonte.pokedex.model;

import java.util.ArrayList;
import java.util.List;

public class PokemonDetails {
    int id;
    int number;
    String name;
    String sprite;
    List<String> types = new ArrayList<>();
    double weight;
    double height;
    List<Move> moves = new ArrayList<>();
    String description;
    BaseStats baseStats;

    public PokemonDetails(int id, int number, String name, String sprite, List<String> types, double weight, double height, List<Move> moves, String description, BaseStats baseStats) {
        this.id = id;
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
        this.baseStats = baseStats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BaseStats getBaseStats() {
        return baseStats;
    }

    public void setBaseStats(BaseStats baseStats) {
        this.baseStats = baseStats;
    }
}
