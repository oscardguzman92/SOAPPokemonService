package com.PokemonApp.SOAPPokemonService.application.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPokemonsRequest", namespace = "http://www.pokemonapp.com/pokemon")
public class GetPokemonsRequest {
    private int offset;
    private int limit;

    // Constructor
    public GetPokemonsRequest() {}

    public GetPokemonsRequest(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    @XmlElement(namespace = "http://www.pokemonapp.com/pokemon")
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @XmlElement(namespace = "http://www.pokemonapp.com/pokemon")
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
