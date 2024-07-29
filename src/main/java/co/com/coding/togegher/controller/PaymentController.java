package co.com.coding.togegher.controller;

import co.com.coding.togegher.enume.EventEnum;
import com.demo.resilencia.exception.NotFoundException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

@Slf4j
@RestController
public class PaymentController {


    @GetMapping("/processPayment/{opcionEvent}")
    public String  processPayment(@PathVariable(required = true)  Integer opcionEvent) throws Exception {
            log.info("PARAM " + opcionEvent);


            if (opcionEvent == EventEnum.DELAY.getOpcion() ) {
                Thread.sleep(2000);
            } else if (opcionEvent == EventEnum.EXCEPTION_NOTFOUND.getOpcion())  {
                Exception ex = new NotFoundException();
                throw ex;
            }
           return "Pago procesado exitosamente";
    }


	@GetMapping("/processPaymentDelay")
    public String processPaymentDelay() throws Exception {
        Thread.sleep(2000);

        return "Pago procesado";
    }



}