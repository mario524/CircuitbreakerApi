package co.com.coding.togegher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

@RestController
public class PaymentController {

    private boolean banderaTimeOut = true;

    @GetMapping("/processPayment")
    public String  processPayment()  {
           return "Pago procesado exitosamente";
    }


	@GetMapping("/processPaymentDelay")
    public String processPaymentDelay() throws Exception {
        Thread.sleep(2000);

        return "Pago procesado";
    }



}