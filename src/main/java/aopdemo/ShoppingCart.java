package aopdemo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    //Logging - These are aspects that should be separated from our Business Logic

    //Authentication & Authorization
    //Sanitize the Data
    public  void  checkOut(String status){
        System.out.println("Checkout method from ShoppingCart Called");
    }

    public  int quantity(){
        return 2;
    }
}