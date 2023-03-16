package frontend;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import server.entities.Ablesung;

public class AblesebogenRessource {
    Client client = ClientBuilder.newClient();

    public AblesebogenRessource() {

    }

    public void addAblesung(Ablesung ablesung) {
        final var target = client.target("http://localhost:8080/ablesung").request(MediaType.APPLICATION_JSON_TYPE);

        try (final var response = target.post(Entity.json(ablesung))) {
            System.out.println("addAblesung: " + response.getStatus());

        } catch (Exception e) {
            // TODO error
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
