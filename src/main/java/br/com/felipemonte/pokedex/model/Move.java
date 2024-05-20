package br.com.felipemonte.pokedex.model;

public class Move {
    int id;
    String name;
    String type;
    int power;

    public Move(String name, String type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
