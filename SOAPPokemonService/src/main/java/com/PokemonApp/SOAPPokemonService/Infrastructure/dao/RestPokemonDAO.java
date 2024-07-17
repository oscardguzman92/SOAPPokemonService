package com.PokemonApp.SOAPPokemonService.Infrastructure.dao;

import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class RestPokemonDAO implements IPokemonDAO {

    private final RestTemplate restTemplate;
    private final String pokeapiUrl;

    public RestPokemonDAO(RestTemplate restTemplate, @Value("${pokeapi.url}") String pokeapiUrl) {
        this.restTemplate = restTemplate;
        this.pokeapiUrl = pokeapiUrl;
    }

    @Override
    public PokemonResponse getPokemons(int offset, int limit) {
        String url = pokeapiUrl + "?offset=" + offset + "&limit=" + limit;
        try {
            return restTemplate.getForObject(url, PokemonResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}