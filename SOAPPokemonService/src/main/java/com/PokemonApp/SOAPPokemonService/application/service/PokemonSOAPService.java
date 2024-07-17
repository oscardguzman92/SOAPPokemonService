package com.PokemonApp.SOAPPokemonService.application.service;

import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;
import jakarta.jws.WebMethod;
import org.springframework.beans.factory.annotation.Autowired;

public class PokemonSOAPService implements IPokemonSOAPService {

    @Autowired
    private IPokemonService iPokemonService;

    @Override
    @WebMethod
    public PokemonResponse getPokemons(int offset, int limit){
        return iPokemonService.getPokemons(offset, limit);
    }
}
