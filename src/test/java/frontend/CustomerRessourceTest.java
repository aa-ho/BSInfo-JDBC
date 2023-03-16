package frontend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CustomerRessourceTest {

    @Test
    void noPlsDont() {
        new CustomerRessource().addCustomer("a", "b");
    }
  
}