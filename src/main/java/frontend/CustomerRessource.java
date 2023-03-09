//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package frontend;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;
import java.util.UUID;
import server.entities.Customer;

public class CustomerRessource {
    Client client = ClientBuilder.newClient();
    private static final String API_ENDPOINT = "http://localhost:8080/customer";

    public CustomerRessource() {
    }

    public Customer addCustomer(String name, String vorname) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setVorname(vorname);
        Response response = this.client.target("http://localhost:8080/customer").request(new String[]{"application/json"}).post(Entity.json(customer));
        System.out.println("addCustomer: " + response.getStatus());

        try {
            Response var5 = response;

            Customer var6;
            try {
                var6 = (Customer)response.readEntity(Customer.class);
            } catch (Throwable var9) {
                if (response != null) {
                    try {
                        var5.close();
                    } catch (Throwable var8) {
                        var9.addSuppressed(var8);
                    }
                }

                throw var9;
            }

            if (response != null) {
                response.close();
            }

            return var6;
        } catch (Exception var10) {
            var10.printStackTrace();
            throw new RuntimeException(var10);
        }
    }

    public Customer getCustomer(UUID id) {
        Response response = this.client.target("http://localhost:8080/customer").path(id.toString()).request(new String[]{"application/json"}).get();
        System.out.println("getCustomer: " + response.getStatus());

        try {
            Response var3 = response;

            Customer var4;
            try {
                var4 = (Customer)response.readEntity(Customer.class);
            } catch (Throwable var7) {
                if (response != null) {
                    try {
                        var3.close();
                    } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                    }
                }

                throw var7;
            }

            if (response != null) {
                response.close();
            }

            return var4;
        } catch (Exception var8) {
            var8.printStackTrace();
            throw new RuntimeException(var8);
        }
    }
}
