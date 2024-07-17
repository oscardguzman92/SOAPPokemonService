package com.PokemonApp.SOAPPokemonService.Infrastructure.dao;

import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;

public interface IPokemonDAO {
    PokemonResponse getPokemons(int offset, int limit);
}
