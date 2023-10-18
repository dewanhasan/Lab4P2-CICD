package ie.atu.registrationservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDetails userDetails){
        String message = "Hello " + userDetails.getName() + ", Email" + userDetails.getEmail();
        return message;
    }
}
