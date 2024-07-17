package com.PokemonApp.SOAPPokemonService.application.service;

import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;
import jakarta.jws.WebMethod;
import org.springframework.beans.factory.annotation.Autowired;

public class PokemonSOAPService {

    @Autowired
    private IPokemonService iPokemonService;

    @WebMethod
    public PokemonResponse getPokemons(int offset, int limit){
        return iPokemonService.getPokemons(offset, limit);
    }
}
