package ie.atu.registrationservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDetails userDetails){
        System.out.println("Welcome to Registration Service!");
        System.out.println("name " + userDetails.getName());
        System.out.println("email " + userDetails.getEmail());

        return " User Registered! ";
    }
}
