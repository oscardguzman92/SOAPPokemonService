
# SOAPPokemonService


## Overview
This project implements a SOAP web service that integrates with the Pokemon API (pokeapi.co) to retrieve Pokemon data. It provides functionalities to fetch Pokémon details via SOAP requests.

## Technologies Used
Java (22.0.1): Programming language used for backend development.

Spring Boot (3.3.1): Framework used for creating SOAP web services and managing dependencies.

Maven (3.8.1): Dependency management and build tool.

Jakarta XML Binding (JAXB): For XML marshalling and unmarshalling.

Spring Web Services: Facilitates building contract-first SOAP services.

RESTful API: Integration with the Pokémon REST API for data retrieval.JUnit: Framework for unit testing.

Git: Version control system.


# Architecture and Design Patterns
## Architecture
The project follows a three-tier architecture:

*Application Layer*: Contains the service interfaces and application of domain rules.
  - **usecase**: Data transfer objects, contains the use case implementations such as `GetPokemonsRequest` and `GetPokemonsResponse`.
  - **service**: Contains service interfaces and their implementations like `IPokemonService` and `PokemonService`.
   
*Domain Layer*: Includes all data models and business/domain rules.
  - **model**: Contains the domain models such as `Pokemon` and `PokemonResponse`.
    
*Infrastructure Layer*: Data access objects (DAOs), SOAP endpoints and external API integration in application.
  - **dao**: Contains Data Access Objects (DAOs) such as `PokemonDAO` and `RestPokemonDAO`.
  - **endpoint**: Contains the SOAP endpoints, including `PokemonEndpoint`.
  - **config**: Contains configuration files like `WebServiceConfig` and `RestTemplateConfig`.

## Design Patterns
DAO Pattern: Implemented in PokemonService, PokemonDAO, and RestPokemonDAO to separate business logic from data access logic.

Singleton Pattern: Applied to RestTemplate configuration (RestTemplateConfig) to ensure a single instance throughout the application, promoting resource efficiency and consistency.

Adapter Pattern: By simplifying the `Pokemon` and `PokemonResponse` classes to be used for both REST and SOAP responses, we leverage the Adapter pattern. This allows the application to handle different types of requests and responses uniformly, facilitating integration and promoting code reuse across different modules of the application.



# Setup and Usage
Clone Repository:

bash
- git clone https://github.com/oscardguzman92/SOAPPokemonService

Build Project:
- mvn clean install

Run Application:
mvn spring-boot:run

Access SOAP Service:
WSDL URL: http://localhost:8080/ws/pokemons.wsdl
Use SOAP clients like SOAP UI to interact with endpoints.

Request XML:

`<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:pok="http://www.pokemonapp.com/pokemon">
   <soapenv:Header/>
   <soapenv:Body>
      <pok:getPokemonsRequest>
         <pok:offset>0</pok:offset>
         <pok:limit>10</pok:limit>
      </pok:getPokemonsRequest>
   </soapenv:Body>
</soapenv:Envelope>`
