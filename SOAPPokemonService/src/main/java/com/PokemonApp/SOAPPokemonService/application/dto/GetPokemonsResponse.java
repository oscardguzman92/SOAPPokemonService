package com.PokemonApp.SOAPPokemonService.application.dto;

import com.PokemonApp.SOAPPokemonService.domain.model.PokemonResponse;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPokemonsResponse", namespace = "http://www.pokemonapp.com/pokemon")
public class GetPokemonsResponse {
    private PokemonResponse pokemonResponse;

    @XmlElement(name = "pokemonResponse", namespace = "http://www.pokemonapp.com/pokemon")
    public PokemonResponse getPokemonResponse() {
        return pokemonResponse;
    }

    public void setPokemonResponse(PokemonResponse pokemonResponse) {
        this.pokemonResponse = pokemonResponse;
    }
}
