package com.PokemonApp.SOAPPokemonService.application.service;
import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;

public interface IPokemonService {
    PokemonResponse getPokemons(int offset, int limit);
}
