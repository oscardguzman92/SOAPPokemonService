package com.PokemonApp.SOAPPokemonService.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pokemon")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    private String name;
    private String url;

    @XmlElement(name = "name")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "url")
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }
}
