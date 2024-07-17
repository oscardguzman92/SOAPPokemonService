package com.PokemonApp.SOAPPokemonService.Infrastructure.endpoint;


import com.PokemonApp.SOAPPokemonService.application.dto.GetPokemonsRequest;
import com.PokemonApp.SOAPPokemonService.application.dto.GetPokemonsResponse;
import com.PokemonApp.SOAPPokemonService.domain.model.*;
import com.PokemonApp.SOAPPokemonService.application.service.IPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Component
@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://www.pokemonapp.com/pokemon";
    private final IPokemonService ipokemonService;

    @Autowired
    public PokemonEndpoint(IPokemonService ipokemonService){
        this.ipokemonService = ipokemonService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonsRequest")
    @ResponsePayload
    public GetPokemonsResponse getPokemons(@RequestPayload GetPokemonsRequest request) {
        PokemonResponse restResponse = handleRestRequest(request.getOffset(), request.getLimit());
        //PokemonSOAPResponse soapResponse = convertToSOAPResponse(restResponse);
        GetPokemonsResponse response = new GetPokemonsResponse();
        response.setPokemonResponse(restResponse);
        return response;
    }

    public PokemonResponse handleRestRequest(int offset, int limit) {
        return ipokemonService.getPokemons(offset, limit);
    }
}
