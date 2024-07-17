package com.PokemonApp.SOAPPokemonService.application.service;

import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface IPokemonSOAPService {

    @WebMethod
    PokemonResponse getPokemons(int offset, int limit);
}
