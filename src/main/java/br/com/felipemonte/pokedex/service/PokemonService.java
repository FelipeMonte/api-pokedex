package br.com.felipemonte.pokedex.service;

import br.com.felipemonte.pokedex.dto.PokemonDTO;
import br.com.felipemonte.pokedex.dto.PokemonDetailsDTO;
import br.com.felipemonte.pokedex.exceptions.PokemonNaoEncontradoException;
import br.com.felipemonte.pokedex.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    PokemonRepository pokemonRepository = new PokemonRepository();

    public List<PokemonDTO> getPokemons() {
        return PokemonDTO.pokemonsToDTOs(pokemonRepository.findAll());
    }

    public PokemonDetailsDTO getPokemonDetails(int number) throws PokemonNaoEncontradoException {
        try {
            return PokemonDetailsDTO.pokemonDetailsToDTO(pokemonRepository.findById(number));
        } catch (Exception e) {
            throw new PokemonNaoEncontradoException(e);
        }
    }

    public int getPokemonMaxStatValue() {
        return pokemonRepository.getPokemonMaxStatValue();
    }
}
