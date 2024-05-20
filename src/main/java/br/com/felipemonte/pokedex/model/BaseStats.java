package br.com.felipemonte.pokedex.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseStats {
    int hp;
    int attack;
    int defense;
    int specialAttack;
    int specialDefense;
    int speed;

    public BaseStats(
            int hp,
            int attack,
            int defense,
            int specialAttack,
            int specialDefense,
            int speed
    ) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    @JsonProperty("special-attack")
    public int getSpecialAttack() {
        return specialAttack;
    }

    @JsonProperty("special-defense")
    public int getSpecialDefense() {
        return specialDefense;
    }

    public int getSpeed() {
        return speed;
    }
}
