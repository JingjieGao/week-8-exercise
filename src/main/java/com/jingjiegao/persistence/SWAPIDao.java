package com.jingjiegao.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jingjiegao.util.PropertiesLoader;
import com.swapi.Planet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class SWAPIDao {
    private final Logger logger = LogManager.getLogger(this.getClass());

    Planet getPlanet() {
        Client client = ClientBuilder.newClient();
        String baseUrl = PropertiesLoader.getProperty("swapi.base.url");
        String endpoint = PropertiesLoader.getProperty("swapi.planet.endpoint");
        String apiUrl = baseUrl + endpoint;

        WebTarget target = client.target(apiUrl);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Planet planet = null;
        try {
            planet = mapper.readValue(response, Planet.class);
        } catch (JsonProcessingException e) {
            logger.error("Error processing JSON response", e);
        }
        return planet;
    }
}
