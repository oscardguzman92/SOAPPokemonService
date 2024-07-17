package com.PokemonApp.SOAPPokemonService.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "pokemonResponse", namespace = "http://www.pokemonapp.com/pokemon")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonResponse {
    private int count;
    private String next;
    private String previous;
    private List<Pokemon> results;

    @XmlElement(name = "count")
    @JsonProperty("count")
    public int getCount() {
        return count;
    }


    @XmlElement(name = "next")
    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @XmlElement(name = "previous")
    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    @XmlElementWrapper(name = "results")
    @XmlElement(name = "pokemon")
    @JsonProperty("results")
    public List<Pokemon> getResults() {
        return results;
    }

}