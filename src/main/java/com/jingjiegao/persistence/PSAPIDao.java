package com.jingjiegao.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jingjiegao.util.PropertiesLoader;
import com.petstore.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PSAPIDao {
    private final Logger logger = LogManager.getLogger(this.getClass());

    Order getOrder() {
        Client client = ClientBuilder.newClient();
        String apiUrl = PropertiesLoader.getProperty("petstore.api.url");

        WebTarget target = client.target(apiUrl);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Order order = null;
        try {
            order = mapper.readValue(response, Order.class);
        } catch (JsonProcessingException e) {
            logger.error("Error processing JSON response", e);
        }
        return order;
    }
}
