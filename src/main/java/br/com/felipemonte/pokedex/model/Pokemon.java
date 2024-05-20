package br.com.felipemonte.pokedex.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    int id;
    int number;
    String name;
    String spriteUrl;
    List<String> types = new ArrayList<>();

    public Pokemon(int id, int number, String name, String spriteUrl, List<String> types) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.spriteUrl = spriteUrl;
        for (String type : types) {
            this.types.add(type);
        }
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

    public String getSpriteUrl() { return spriteUrl; }

    public void setSpriteUrl(String spriteUrl) { this.spriteUrl = spriteUrl; }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
