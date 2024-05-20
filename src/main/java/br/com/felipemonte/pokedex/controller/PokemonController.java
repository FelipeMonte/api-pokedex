package br.com.felipemonte.pokedex.controller;

import br.com.felipemonte.pokedex.dto.PokemonDTO;
import br.com.felipemonte.pokedex.dto.PokemonDetailsDTO;
import br.com.felipemonte.pokedex.exceptions.PokemonNaoEncontradoException;
import br.com.felipemonte.pokedex.service.PokemonService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://pokedex-2817f.web.app", maxAge = 3600)
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemons")
    public ResponseEntity<List<PokemonDTO>> getPokemons(HttpServletRequest request) throws java.net.MalformedURLException{
        return ResponseEntity.ok(pokemonService.getPokemons());
    }

    @GetMapping("/pokemons/{number}")
    public ResponseEntity<PokemonDetailsDTO> getPokemonDetails(@PathVariable @NumberFormat int number)  throws PokemonNaoEncontradoException {
        return ResponseEntity.ok(pokemonService.getPokemonDetails(number));
    }

    @GetMapping("/pokemons/maxStatValue")
    public ResponseEntity<Integer> getPokemonMaxStatValue(){
        return ResponseEntity.ok(pokemonService.getPokemonMaxStatValue());
    }
}
