package com.PokemonApp.SOAPPokemonService.application.service;

import com.PokemonApp.SOAPPokemonService.Infrastructure.dao.IPokemonDAO;
import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;
import org.springframework.stereotype.Service;

@Service
public class PokemonService implements IPokemonService {
    /*private final RestTemplate restTemplate = new RestTemplate();
    private final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon";*/
    private final IPokemonDAO pokemonDAO;

    public PokemonService(IPokemonDAO pokemonDAO) {
        this.pokemonDAO = pokemonDAO;
    }
    /*@Override
    public PokemonResponse getPokemons(int offset, int limit) {
        String url = POKEAPI_URL + "?offset=" + offset + "&limit=" + limit;
        return restTemplate.getForObject(url, PokemonResponse.class);
    }*/
    @Override
    public PokemonResponse getPokemons(int offset, int limit) {
        return pokemonDAO.getPokemons(offset, limit);
    }
}
