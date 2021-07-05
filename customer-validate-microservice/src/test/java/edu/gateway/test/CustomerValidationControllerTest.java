package edu.gateway.poc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerValidationControllerTest {

    @Test
    public void testCustomerValidate(){

        CustomerValidationController customerValidationController
                        = new CustomerValidationController();

        String res = customerValidationController.customerValidate();
        assertEquals("Customer Validated successfully !!",res);
    }
}
